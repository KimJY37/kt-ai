package com.example.dbtest;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Robot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int no;
	
	private int model_no;
	private String robotSerial;
	private String robotVersion;
	private String robotName;
	private String companyUid;
	private String organizationUid;
	private String managerUid;
	private int mainImgNo;
	private int MarkerImgNo;
	private String registerState;
	private int robotBattery;
	private String robotState;
	private String useYn;
	private Timestamp registerDate;
	private String registerUid;
	private Timestamp modifyDate;
	private String modifyUid;
	private String modifyIp;
	private String saId;
	private String devicestcCd;
	private String linesvcNo;
	private String ctrlYn;
	private String svcTypeCd;
	private String robotLvl;
	private String memo;
	private String mainImgFileId;
	private String markerImgFileId;
	
	@ManyToOne
	@JoinColumn(name="ROBOTMODEL_NO")
	private RobotModel robotmodel;
	
	public RobotModel getRobotmodel() {
		return robotmodel;
	}
	public void setRobotmodel(RobotModel robotmodel) {
		this.robotmodel = robotmodel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public String getRobotSerial() {
		return robotSerial;
	}
	public void setRobotSerial(String robotSerial) {
		this.robotSerial = robotSerial;
	}
	public String getRobotVersion() {
		return robotVersion;
	}
	public void setRobotVersion(String robotVersion) {
		this.robotVersion = robotVersion;
	}
	public String getRobotName() {
		return robotName;
	}
	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}
	public String getCompanyUid() {
		return companyUid;
	}
	public void setCompanyUid(String companyUid) {
		this.companyUid = companyUid;
	}
	public String getOrganizationUid() {
		return organizationUid;
	}
	public void setOrganizationUid(String organizationUid) {
		this.organizationUid = organizationUid;
	}
	public String getManagerUid() {
		return managerUid;
	}
	public void setManagerUid(String managerUid) {
		this.managerUid = managerUid;
	}
	public int getMainImgNo() {
		return mainImgNo;
	}
	public void setMainImgNo(int mainImgNo) {
		this.mainImgNo = mainImgNo;
	}
	public int getMarkerImgNo() {
		return MarkerImgNo;
	}
	public void setMarkerImgNo(int markerImgNo) {
		MarkerImgNo = markerImgNo;
	}
	public String getRegisterState() {
		return registerState;
	}
	public void setRegisterState(String registerState) {
		this.registerState = registerState;
	}
	public int getRobotBattery() {
		return robotBattery;
	}
	public void setRobotBattery(int robotBattery) {
		this.robotBattery = robotBattery;
	}
	public String getRobotState() {
		return robotState;
	}
	public void setRobotState(String robotState) {
		this.robotState = robotState;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public Timestamp getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}
	public String getRegisterUid() {
		return registerUid;
	}
	public void setRegisterUid(String registerUid) {
		this.registerUid = registerUid;
	}
	public Timestamp getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyUid() {
		return modifyUid;
	}
	public void setModifyUid(String modifyUid) {
		this.modifyUid = modifyUid;
	}
	public String getModifyIp() {
		return modifyIp;
	}
	public void setModifyIp(String modifyIp) {
		this.modifyIp = modifyIp;
	}
	public String getSaId() {
		return saId;
	}
	public void setSaId(String saId) {
		this.saId = saId;
	}
	public String getDevicestcCd() {
		return devicestcCd;
	}
	public void setDevicestcCd(String devicestcCd) {
		this.devicestcCd = devicestcCd;
	}
	public String getLinesvcNo() {
		return linesvcNo;
	}
	public void setLinesvcNo(String linesvcNo) {
		this.linesvcNo = linesvcNo;
	}
	public String getCtrlYn() {
		return ctrlYn;
	}
	public void setCtrlYn(String ctrlYn) {
		this.ctrlYn = ctrlYn;
	}
	public String getSvcTypeCd() {
		return svcTypeCd;
	}
	public void setSvcTypeCd(String svcTypeCd) {
		this.svcTypeCd = svcTypeCd;
	}
	public String getRobotLvl() {
		return robotLvl;
	}
	public void setRobotLvl(String robotLvl) {
		this.robotLvl = robotLvl;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMainImgFileId() {
		return mainImgFileId;
	}
	public void setMainImgFileId(String mainImgFileId) {
		this.mainImgFileId = mainImgFileId;
	}
	public String getMarkerImgFileId() {
		return markerImgFileId;
	}
	public void setMarkerImgFileId(String markerImgFileId) {
		this.markerImgFileId = markerImgFileId;
	}
	@Override
	public String toString() {
		return "Robot [robotSerial=" + robotSerial + ", robotmodel=" + robotmodel + "]";
	}
	
	
}
