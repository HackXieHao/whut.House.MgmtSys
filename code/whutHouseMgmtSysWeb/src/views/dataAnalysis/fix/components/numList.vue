<template>
  <div class="card numList"
       :style="{height:height,width:width}"
       v-loading="listLoading">
    <div class="title">
      <strong>数据分析</strong>
    </div>
    <div class="content">
      <el-row>
        <el-col :span="1">
          <my-icon icon-class="dian"></my-icon>
        </el-col>
        <el-col :span="8">
          <span>总维修申请<br></span>
          <span>
            <count-to class="card-panel-num"
                      :startVal="0"
                      :endVal="numList.totalFixApply"
                      :duration="3200"></count-to>
          </span>
          <span>单</span>
        </el-col>
        <el-col :span="1"
                :offset="2">
          <my-icon icon-class="dian"></my-icon>
        </el-col>
        <el-col :span="10">
          <span>已处理申请<br></span>
          <span>
            <count-to class="card-panel-num"
                      :startVal="0"
                      :endVal="numList.totalFixHandle"
                      :duration="3200"></count-to>
          </span>
          <span>单</span>
        </el-col>
      </el-row>
      <el-row style="margin-top:20px">
        <el-col :span="1">
          <my-icon icon-class="dian"></my-icon>
        </el-col>
        <el-col :span="8">
          <span>已拒绝申请<br></span>
          <span>
            <count-to class="card-panel-num"
                      :startVal="0"
                      :endVal="numList.totalFixRefuse"
                      :duration="3200"></count-to>
          </span>
          <span>单</span>
        </el-col>
        <el-col :span="1"
                :offset="2">
          <my-icon icon-class="dian"></my-icon>
        </el-col>
        <el-col :span="8">
          <span>维修受理率<br></span>
          <span style="color:red;">
            <count-to class="card-panel-num"
                      :startVal="0"
                      :endVal="numList.handleRate"
                      :duration="3200"></count-to>
            %
          </span>
        </el-col>
      </el-row>
      <!-- ***** -->
      <el-row style="margin-top:20px">
        <el-col :span="1">
          <my-icon icon-class="dian"></my-icon>
        </el-col>
        <el-col :span="8">
          <span>资金花费<br></span>
          <span>
            <count-to class="card-panel-num"
                      :startVal="0"
                      :endVal="numList.totalFixMoney"
                      :duration="3200"></count-to>
          </span>
          <span>元</span>
        </el-col>
        <el-col :span="1"
                :offset="2">
          <my-icon icon-class="dian"></my-icon>
        </el-col>
        <el-col :span="8">
          <span>平均住户反馈<br></span>
          <span>
            <count-to class="card-panel-num"
                      :startVal="0"
                      :endVal="numList.aveFixRatings"
                      :duration="3200"></count-to>
          </span>
          <span>星</span>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script type="text/ecmascript-6">
import countTo from "vue-count-to";
import {
  postFixFormTotalRecord
} from "@/api/dataAnalysis.js";

export default {
  data () {
    return {
      listLoading: false,
      numList: {}
    };
  },
  props: {
    width: {
      type: String,
      default: "100%"
    },
    height: {
      type: String,
      default: "350px"
    },
    filtersData: {
      type: Object,
      default: {}
    }
  },
  components: {
    countTo
  },
  created () {
    this.getData();
  },
  watch: {
    filtersData (newVal) {
      this.getData(newVal);
    }
  },
  methods: {
    getData () {
      this.listLoading = false;
      let params = {
        paramTypeId: 1
      };
      if (arguments[0] !== undefined) var data = arguments[0];
      else var data = {};
      postFixFormTotalRecord(data).then(res => {
        this.numList = res.data.data
      });
    }
  }
};

</script>

<style scoped lang="scss">
.title {
  padding: 10px 0 0 10px;
  position: relative;
  width: 100%;
  &::after {
    content: "";
    width: 95%;
    height: 2px;
    background-color: #dcdcdc;
    position: absolute;
    bottom: -10px;
    z-index: 1;
    left: 1%;
    right: 1%;
  }
}

.content {
  margin-top: 15px;
  padding: 20px;
  span {
    font-size: 1.1vw;
    font-weight: 600;
    .card-panel-num {
      color: red;
    }
  }
}

.chart {
  margin-top: 30px;
  height: calc(100% - 55px);
}
</style>
