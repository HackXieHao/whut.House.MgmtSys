package com.computerdesign.whutHouseMgmt.bean.fix.common;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ViewFix {
    private Integer id;

    private String fixContentId;

    private String fixContentName;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date applyTime;

    private String fixState;

    private String acceptState;

    private String acceptNote;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date acceptTime;

    private String acceptMan;

    private String agreeState;

    private String agreeNote;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date agreeTime;

    private String agreeMan;

    private Integer staffId;

    private String staffNo;

    private String staffName;

    private String titleName;

    private String postName;

    private String deptName;

    private Integer houseId;

    private String houseNo;

    private Integer buildingId;

    private String buildingName;

    private Integer regionId;

    private String regionName;

    private Integer campusId;

    private String campusName;

    private String address;

    private String phone;

    private String message;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date priceTime;

    private String priceMan;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date checkTime;

    private String checkMan;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date fixTime;

    private String fixMoney;

    private Boolean isOver;

    private Boolean isCheck;

    private String feedBack;

    private String email;

    private String ratings;

    private String ratingDescription;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date submitTime;

    private Boolean isPaySelf;
    
    private String isPaySelfName;
    
    private String fixFiles;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFixContentId() {
        return fixContentId;
    }

    public void setFixContentId(String fixContentId) {
        this.fixContentId = fixContentId == null ? null : fixContentId.trim();
    }

    public String getFixContentName() {
        return fixContentName;
    }

    public void setFixContentName(String fixContentName) {
        this.fixContentName = fixContentName == null ? null : fixContentName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getFixState() {
        return fixState;
    }

    public void setFixState(String fixState) {
        this.fixState = fixState == null ? null : fixState.trim();
    }

    public String getAcceptState() {
        return acceptState;
    }

    public void setAcceptState(String acceptState) {
        this.acceptState = acceptState == null ? null : acceptState.trim();
    }

    public String getAcceptNote() {
        return acceptNote;
    }

    public void setAcceptNote(String acceptNote) {
        this.acceptNote = acceptNote == null ? null : acceptNote.trim();
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getAcceptMan() {
        return acceptMan;
    }

    public void setAcceptMan(String acceptMan) {
        this.acceptMan = acceptMan == null ? null : acceptMan.trim();
    }

    public String getAgreeState() {
        return agreeState;
    }

    public void setAgreeState(String agreeState) {
        this.agreeState = agreeState == null ? null : agreeState.trim();
    }

    public String getAgreeNote() {
        return agreeNote;
    }

    public void setAgreeNote(String agreeNote) {
        this.agreeNote = agreeNote == null ? null : agreeNote.trim();
    }

    public Date getAgreeTime() {
        return agreeTime;
    }

    public void setAgreeTime(Date agreeTime) {
        this.agreeTime = agreeTime;
    }

    public String getAgreeMan() {
        return agreeMan;
    }

    public void setAgreeMan(String agreeMan) {
        this.agreeMan = agreeMan == null ? null : agreeMan.trim();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo == null ? null : houseNo.trim();
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName == null ? null : campusName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    public String getPriceMan() {
        return priceMan;
    }

    public void setPriceMan(String priceMan) {
        this.priceMan = priceMan == null ? null : priceMan.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckMan() {
        return checkMan;
    }

    public void setCheckMan(String checkMan) {
        this.checkMan = checkMan == null ? null : checkMan.trim();
    }

    public Date getFixTime() {
        return fixTime;
    }

    public void setFixTime(Date fixTime) {
        this.fixTime = fixTime;
    }

    public String getFixMoney() {
        return fixMoney;
    }

    public void setFixMoney(String fixMoney) {
        this.fixMoney = fixMoney == null ? null : fixMoney.trim();
    }

    public Boolean getIsOver() {
        return isOver;
    }

    public void setIsOver(Boolean isOver) {
        this.isOver = isOver;
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean isCheck) {
        this.isCheck = isCheck;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack == null ? null : feedBack.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings == null ? null : ratings.trim();
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription == null ? null : ratingDescription.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

	public Boolean getIsPaySelf() {
		return isPaySelf;
	}

	public void setIsPaySelf(Boolean isPaySelf) {
		this.isPaySelf = isPaySelf;
	}

	public String getIsPaySelfName() {
		return isPaySelfName;
	}

	public void setIsPaySelfName(String isPaySelfName) {
		this.isPaySelfName = isPaySelfName;
	}

	public String getFixFiles() {
		return fixFiles;
	}

	public void setFixFiles(String fixFiles) {
		this.fixFiles = fixFiles;
	}
    
}