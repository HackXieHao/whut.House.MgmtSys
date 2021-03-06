package com.computerdesign.whutHouseMgmt.bean.rentparam;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RentEventModel {
	private Integer rentEventId;
	//
	// private Integer paramTypeId;
	//
	// private String paramTypeName;
	//
	// private Boolean rentIsOpenSel;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date rentTimeBegin;
	
	private String dayRentTimeBegin;
	
	private String dayRentTimeEnd;
	
	private Integer rentTimeRanges;

	private String rentSelValReq;

	private String rentSelRules;

	// private Boolean isDelete;

	public Integer getRentEventId() {
		return rentEventId;
	}

	public String getDayRentTimeBegin() {
		return dayRentTimeBegin;
	}

	public void setDayRentTimeBegin(String dayRentTimeBegin) {
		this.dayRentTimeBegin = dayRentTimeBegin;
	}

	public String getDayRentTimeEnd() {
		return dayRentTimeEnd;
	}

	public void setDayRentTimeEnd(String dayRentTimeEnd) {
		this.dayRentTimeEnd = dayRentTimeEnd;
	}

	public void setRentEventId(Integer rentEventId) {
		this.rentEventId = rentEventId;
	}
	//
	// public Integer getParamTypeId() {
	// return paramTypeId;
	// }
	//
	// public void setParamTypeId(Integer paramTypeId) {
	// this.paramTypeId = paramTypeId;
	// }
	//
	// public String getParamTypeName() {
	// return paramTypeName;
	// }
	//
	// public void setParamTypeName(String paramTypeName) {
	// this.paramTypeName = paramTypeName;
	// }
	//
	// public Boolean getRentIsOpenSel() {
	// return rentIsOpenSel;
	// }
	//
	// public void setRentIsOpenSel(Boolean rentIsOpenSel) {
	// this.rentIsOpenSel = rentIsOpenSel;
	// }

	public String getRentSelValReq() {
		return rentSelValReq;
	}

	public Date getRentTimeBegin() {
		return rentTimeBegin;
	}

	public void setRentTimeBegin(Date rentTimeBegin) {
		this.rentTimeBegin = rentTimeBegin;
	}

	public Integer getRentTimeRanges() {
		return rentTimeRanges;
	}

	public void setRentTimeRanges(Integer rentTimeRanges) {
		this.rentTimeRanges = rentTimeRanges;
	}

	public void setRentSelValReq(String rentSelValReq) {
		this.rentSelValReq = rentSelValReq;
	}

	public String getRentSelRules() {
		return rentSelRules;
	}

	public void setRentSelRules(String rentSelRules) {
		this.rentSelRules = rentSelRules;
	}

	// public Boolean getIsDelete() {
	// return isDelete;
	// }
	//
	// public void setIsDelete(Boolean isDelete) {
	// this.isDelete = isDelete;
	// }

}
