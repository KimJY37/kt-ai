package com.example.dbtest;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RobotModel {
	
		@Id
		@Column(name = "ROBOTMODEL_NO")
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int no;
		
		private String companyUid;
		private String accountUid;
		private String modelName;
		private String modelVersion;
		private int mainImgNo;
		private int markerIngNo;
		private String modelCmd;
		private String useYn;
		private Timestamp registerDate;
		private String registerUid;
		private Timestamp modifyDate;
		private String modifyUid;
		private String modifyIp;
		private String bizMaterialCd;
		private String CntlYn;
		private String modelVdoTrnsms;
		private String iotModelId;
		private String svcTypeCd;
		private String fotaInfYn;
		private String fotaModelId;
		private String fotaGwId;
		private String iotGwId;
		private int fotaTgtId;
		
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getCompanyUid() {
			return companyUid;
		}
		public void setCompanyUid(String companyUid) {
			this.companyUid = companyUid;
		}
		public String getAccountUid() {
			return accountUid;
		}
		public void setAccountUid(String accountUid) {
			this.accountUid = accountUid;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public String getModelVersion() {
			return modelVersion;
		}
		public void setModelVersion(String modelVersion) {
			this.modelVersion = modelVersion;
		}
		public int getMainImgNo() {
			return mainImgNo;
		}
		public void setMainImgNo(int mainImgNo) {
			this.mainImgNo = mainImgNo;
		}
		public int getMarkerIngNo() {
			return markerIngNo;
		}
		public void setMarkerIngNo(int markerIngNo) {
			this.markerIngNo = markerIngNo;
		}
		public String getModelCmd() {
			return modelCmd;
		}
		public void setModelCmd(String modelCmd) {
			this.modelCmd = modelCmd;
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
		public String getBizMaterialCd() {
			return bizMaterialCd;
		}
		public void setBizMaterialCd(String bizMaterialCd) {
			this.bizMaterialCd = bizMaterialCd;
		}
		public String getCntlYn() {
			return CntlYn;
		}
		public void setCntlYn(String cntlYn) {
			CntlYn = cntlYn;
		}
		public String getModelVdoTrnsms() {
			return modelVdoTrnsms;
		}
		public void setModelVdoTrnsms(String modelVdoTrnsms) {
			this.modelVdoTrnsms = modelVdoTrnsms;
		}
		public String getIotModelId() {
			return iotModelId;
		}
		public void setIotModelId(String iotModelId) {
			this.iotModelId = iotModelId;
		}
		public String getSvcTypeCd() {
			return svcTypeCd;
		}
		public void setSvcTypeCd(String svcTypeCd) {
			this.svcTypeCd = svcTypeCd;
		}
		public String getFotaInfYn() {
			return fotaInfYn;
		}
		public void setFotaInfYn(String fotaInfYn) {
			this.fotaInfYn = fotaInfYn;
		}
		public String getFotaModelId() {
			return fotaModelId;
		}
		public void setFotaModelId(String fotaModelId) {
			this.fotaModelId = fotaModelId;
		}
		public String getFotaGwId() {
			return fotaGwId;
		}
		public void setFotaGwId(String fotaGwId) {
			this.fotaGwId = fotaGwId;
		}
		public String getIotGwId() {
			return iotGwId;
		}
		public void setIotGwId(String iotGwId) {
			this.iotGwId = iotGwId;
		}
		public int getFotaTgtId() {
			return fotaTgtId;
		}
		public void setFotaTgtId(int fotaTgtId) {
			this.fotaTgtId = fotaTgtId;
		}

	}

