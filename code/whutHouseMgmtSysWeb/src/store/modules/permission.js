import {
  asyncRouterMap,
  constantRouterMap
} from '@/router'
import {
  getAuth
} from '@/api/user'

function getRemoteAuth() {
  return new Promise((resolve) => {
    getAuth().then(res => {
      const remoteAuth = res.data.data.roles
      filterAuth(remoteAuth, asyncRouterMap)
      console.log(remoteAuth)
      console.log(asyncRouterMap)
      resolve()
    })
  })

}

function filterAuth(remoteAuth, asyncRouterMap) {
  asyncRouterMap.forEach(route => {
    remoteAuth.forEach(auth => {
      if (route.name == auth.name) {
        console.log(route.name)
      }
    })
    if (route.children && route.children.length) {
      filterAuth(remoteAuth, route.children)
    }
  })
}
/**
 * 通过meta.role判断是否与当前用户权限匹配
 * @param roles
 * @param route
 */
function hasPermission(roles, route) {
  if (route.meta && route.meta.roles) {
    return roles.some(role => route.meta.roles.indexOf(role) >= 0)
  } else {
    return true
  }
}
/**
 * 递归过滤异步路由表，返回符合用户角色权限的路由表
 * @param asyncRouterMap
 * @param roles
 */
function filterAsyncRouter(asyncRouterMap, roles) {
  const accessedRouters = asyncRouterMap.filter(route => {
    if (hasPermission(roles, route)) {
      if (route.children && route.children.length) {
        route.children = filterAsyncRouter(route.children, roles)
      }
      return true
    }
    return false
  })
  return accessedRouters
}

const permission = {
  state: {
    routers: constantRouterMap,
    addRouters: []
  },
  mutations: {
    SET_ROUTERS: (state, routers) => {
      state.addRouters = routers
      state.routers = constantRouterMap.concat(routers)
    }
  },
  actions: {
    GenerateRoutes({
      commit
    }, data) {
      return new Promise(resolve => {
        const {
          roles
        } = data
        // console.log(roles.indexOf(3) >= 0)
        let accessedRouters
        if (roles.indexOf(0) >= 0) {
          accessedRouters = asyncRouterMap
        } else {
          getRemoteAuth().then(
            accessedRouters = filterAsyncRouter(asyncRouterMap, roles)
          )

        }
        commit('SET_ROUTERS', accessedRouters)
        resolve()
      })
    }
  }
}

export default permission
