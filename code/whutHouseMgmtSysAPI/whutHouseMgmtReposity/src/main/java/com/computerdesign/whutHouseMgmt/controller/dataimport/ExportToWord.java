﻿package com.computerdesign.whutHouseMgmt.controller.dataimport;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computerdesign.whutHouseMgmt.bean.Msg;
import com.computerdesign.whutHouseMgmt.bean.fix.common.ViewFix;
import com.computerdesign.whutHouseMgmt.bean.staffmanagement.ViewStaff;
import com.computerdesign.whutHouseMgmt.core.DocumentHandler;
import com.computerdesign.whutHouseMgmt.service.fix.ViewFixService;
import com.computerdesign.whutHouseMgmt.service.staffmanagement.ViewStaffService;
import com.computerdesign.whutHouseMgmt.utils.DateUtil;
import com.computerdesign.whutHouseMgmt.utils.DownloadUtils;
import com.computerdesign.whutHouseMgmt.utils.ResponseUtil;

/**
 *
 * @author wanhaoran
 * @date 2018年3月18日 下午2:31:22
 * 
 */
@RestController
@RequestMapping("/exportToWord/")
public class ExportToWord {

	@Autowired
	private ViewStaffService viewStaffService;
	
	@Autowired
	private ViewFixService viewFixService;
	
	@GetMapping(value= "fix/{fixId}")
	public void downloadFixApply(@PathVariable("fixId")Integer fixId,HttpServletResponse httpServletResponse) throws Exception {
		if(viewFixService.getById(fixId).isEmpty()){
			return ;
		}
		ViewFix viewFix = viewFixService.getById(fixId).get(0);
		String[] fileds = { "Id", "FixContentName", "Description", "ApplyTime", "StaffName", "Address", "IsPaySelfName", "Phone"};
		Map<String, Object> response = ResponseUtil.getResultMap(viewFix, fileds);
		
		DocumentHandler documentHandler = new DocumentHandler();

		String outFileName = "维修申请" + DateUtil.getCurrentDate("yyyyMMdd-HHmmss") + response.get("StaffName");
		
		String outFilePath = "E:\\WordTemplate\\"+outFileName+".doc";

		String modelFileName = "武汉理工大学教职工住宅维修单.ftl";
		
		documentHandler.createDocArea(response, outFilePath, modelFileName);
		
		try {
			DownloadUtils.downloadSolve(outFilePath, outFileName+".doc", httpServletResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@GetMapping(value= "hire/{staffId}")
	public void downloadHireApply(@PathVariable("staffId")Integer staffId,HttpServletResponse httpServletResponse) throws Exception {
		
		if (viewStaffService.getByStaffId(staffId).isEmpty()) {
			//TODO
			return ;
		}
		ViewStaff viewStaff = viewStaffService.getByStaffId(staffId).get(0);
		String[] fileds = { "Id", "No", "MarriageState","Name", "Sex","EduQualifications","TitleName", "DeptName", "Tel", 
				"SpouseName","SpouseKindName","SpouseDept","SpouseTitleName","SpouseTel","Code"};
		Map<String, Object> response = ResponseUtil.getResultMap(viewStaff, fileds);
		
		DocumentHandler documentHandler = new DocumentHandler();

		String outFileName = "租赁申请"+DateUtil.getCurrentDate("yyyyMMdd-HHmmss")+response.get("Name");

//		String outFilePath = DocumentHandler.class.getClassLoader().getResource("../../").getPath() + "WEB-INF/HireFiles/"+outFileName+".doc";


//		String outFilePath = "C:\\Users\\user\\Desktop\\"+outFileName+".doc";
		String outFilePath = "E:\\WordTemplate\\"+outFileName+".doc";

		String modelFileName = "申请租赁住房表格.ftl";
		
		documentHandler.createDocArea(response, outFilePath, modelFileName);
		
		try {
			DownloadUtils.downloadSolve(outFilePath, outFileName+".doc", httpServletResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
