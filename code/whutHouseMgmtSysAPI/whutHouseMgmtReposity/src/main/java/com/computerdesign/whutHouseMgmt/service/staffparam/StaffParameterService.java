package com.computerdesign.whutHouseMgmt.service.staffparam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computerdesign.whutHouseMgmt.bean.staffparam.StaffParameter;
import com.computerdesign.whutHouseMgmt.bean.staffparam.StaffParameterExample;
import com.computerdesign.whutHouseMgmt.bean.staffparam.StaffParameterExample.Criteria;
import com.computerdesign.whutHouseMgmt.dao.staffparam.StaffParameterMapper;
import com.computerdesign.whutHouseMgmt.service.base.BaseService;

@Service
public class StaffParameterService implements BaseService<StaffParameter> {
	
	@Autowired
	StaffParameterMapper staffParameterMapper;
		
	public List<StaffParameter> getAllByParamTypeId(Integer paramTypeId){
		StaffParameterExample example = new StaffParameterExample();
		Criteria criteria= example.createCriteria();
		criteria.andParamTypeIdEqualTo(paramTypeId);
		criteria.andIsDeleteEqualTo(false);
		return staffParameterMapper.selectByExample(example);
	}
	
	/**
	 * 根据staffParamId获取一个职工参数
	 * @return
	 */
	public StaffParameter get(Integer staffParamId){
		return staffParameterMapper.selectByPrimaryKey(staffParamId);
	}

	@Override
	public List<StaffParameter> getAll() {
		List<StaffParameter> empParams = staffParameterMapper.selectByExample(null);
	
		return empParams;
	}

	@Override
	public void delete(Integer staffParamId) {
		staffParameterMapper.deleteByPrimaryKey(staffParamId);
	}

	@Override
	public void add(StaffParameter staffParameter) {
		staffParameterMapper.insertSelective(staffParameter);
	}

	@Override
	public void update(StaffParameter staffParameter) {
		staffParameterMapper.updateByPrimaryKeySelective(staffParameter);
		
	}
	

	/**
	 * 通过staffParamId获取该职称或职务的分数
	 * @param staffParamId
	 * @return
	 */
	public Integer getValByStaffParamId(Integer staffParamId){
		StaffParameterExample example = new StaffParameterExample();
		Criteria criteria= example.createCriteria();
		criteria.andStaffParamIdEqualTo(staffParamId);
		criteria.andIsDeleteEqualTo(false);
		return staffParameterMapper.selectByPrimaryKey(staffParamId).getStaffParamVal();
	}

}
