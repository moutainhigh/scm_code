package com.winway.scm.model;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotent.base.model.BaseModel;


 /**
 * 日常合同商品表
 * <pre> 
 * 描述：日常合同商品表 实体对象
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-01-09 09:35:44
 * 版权：美达开发小组
 * </pre>
 */
 @ApiModel(value = "ScmXsEveryDayContractProduct",description = "日常合同商品表") 
public class ScmXsEveryDayContractProduct extends BaseModel<String>{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="id")
	protected String id; 
	
	@ApiModelProperty(value="日常合同ID")
	protected String EveryDayContractId; 
	
	@ApiModelProperty(value="商品品规")
	protected String productGauge; 
	
	@ApiModelProperty(value="药品类型")
	protected String MedicineType; 
	
	@ApiModelProperty(value="商品常用名称")
	protected String commonName; 
	
	@ApiModelProperty(value="单位")
	protected String unit; 
	
	@ApiModelProperty(value="标准包装数")
	protected Integer achage; 
	
	@ApiModelProperty(value="药品供应状态")
	protected String suppyType; 
	
	@ApiModelProperty(value="建议本次申请量")
	protected Integer suggestApplyNum; 
	
	@ApiModelProperty(value="上次发货时间")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	protected java.util.Date lastShipmentDate; 
	
	@ApiModelProperty(value="省区本月SMS销量")
	protected Integer SMSCurrentMonthSales; 
	
	@ApiModelProperty(value="药品编号")
	protected String productCode; 
	
	@ApiModelProperty(value="是否SMS")
	protected String isSMS; 
	
	@ApiModelProperty(value="数量")
	protected Integer theNumber; 
	
	@ApiModelProperty(value="件数")
	protected double packageNum; 
	
	@ApiModelProperty(value="含税单价")
	protected Double unitPrice; 
	
	@ApiModelProperty(value="总价")
	protected Double sumPrice; 
	
	@ApiModelProperty(value="剩余数量")
	protected Integer surplusSUm; 
	
	@ApiModelProperty(value="商品名")
	protected String productName;

	 @ApiModelProperty(value="剂型")
	 protected String AgentType;
	 
	 @ApiModelProperty(value="生产厂家")
	 protected String manufacturer;
	 
	 @ApiModelProperty(value="批准文号")
	 protected String approvalCode;
	 
	 @ApiModelProperty(value="药品分类")
	 protected String medicineClassify;
	 
	 @ApiModelProperty(value="经营范围")
	 protected String businessScope;
	 
	 @ApiModelProperty(value="产品子码")
	 protected String code;
	 
	 public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAgentType() {
		 return AgentType;
	 }

	 public void setAgentType(String agentType) {
		 AgentType = agentType;
	 }

	 public String getManufacturer() {
		 return manufacturer;
	 }

	 public void setManufacturer(String manufacturer) {
		 this.manufacturer = manufacturer;
	 }

	 public String getApprovalCode() {
		 return approvalCode;
	 }

	 public void setApprovalCode(String approvalCode) {
		 this.approvalCode = approvalCode;
	 }

	 public String getMedicineClassify() {
		 return medicineClassify;
	 }

	 public void setMedicineClassify(String medicineClassify) {
		 this.medicineClassify = medicineClassify;
	 }

	 public String getBusinessScope() {
		 return businessScope;
	 }

	 public void setBusinessScope(String businessScope) {
		 this.businessScope = businessScope;
	 }





	 public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 返回 id
	 * @return
	 */
	public String getId() {
		return this.id;
	}
	
	public void setEveryDayContractId(String EveryDayContractId) {
		this.EveryDayContractId = EveryDayContractId;
	}
	
	/**
	 * 返回 日常合同ID
	 * @return
	 */
	public String getEveryDayContractId() {
		return this.EveryDayContractId;
	}
	
	public void setProductGauge(String productGauge) {
		this.productGauge = productGauge;
	}
	
	/**
	 * 返回 商品品规
	 * @return
	 */
	public String getProductGauge() {
		return this.productGauge;
	}
	
	public void setMedicineType(String MedicineType) {
		this.MedicineType = MedicineType;
	}
	
	/**
	 * 返回 药品类型
	 * @return
	 */
	public String getMedicineType() {
		return this.MedicineType;
	}
	
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	
	/**
	 * 返回 商品常用名称
	 * @return
	 */
	public String getCommonName() {
		return this.commonName;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	/**
	 * 返回 单位
	 * @return
	 */
	public String getUnit() {
		return this.unit;
	}
	
	public Integer getAchage() {
		return achage;
	}

	public void setAchage(Integer achage) {
		this.achage = achage;
	}

	
	public void setSuppyType(String suppyType) {
		this.suppyType = suppyType;
	}
	
	/**
	 * 返回 药品供应状态
	 * @return
	 */
	public String getSuppyType() {
		return this.suppyType;
	}
	
	public void setSuggestApplyNum(Integer suggestApplyNum) {
		this.suggestApplyNum = suggestApplyNum;
	}
	
	/**
	 * 返回 建议本次申请量
	 * @return
	 */
	public Integer getSuggestApplyNum() {
		return this.suggestApplyNum;
	}
	
	public void setLastShipmentDate(java.util.Date lastShipmentDate) {
		this.lastShipmentDate = lastShipmentDate;
	}
	
	/**
	 * 返回 上次发货时间
	 * @return
	 */
	public java.util.Date getLastShipmentDate() {
		return this.lastShipmentDate;
	}
	
	public void setSMSCurrentMonthSales(Integer SMSCurrentMonthSales) {
		this.SMSCurrentMonthSales = SMSCurrentMonthSales;
	}
	
	/**
	 * 返回 省区本月SMS销量
	 * @return
	 */
	public Integer getSMSCurrentMonthSales() {
		return this.SMSCurrentMonthSales;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	/**
	 * 返回 药品编号
	 * @return
	 */
	public String getProductCode() {
		return this.productCode;
	}
	
	public void setIsSMS(String isSMS) {
		this.isSMS = isSMS;
	}
	
	/**
	 * 返回 是否SMS
	 * @return
	 */
	public String getIsSMS() {
		return this.isSMS;
	}
	
	public void setTheNumber(Integer theNumber) {
		this.theNumber = theNumber;
	}
	
	/**
	 * 返回 数量
	 * @return
	 */
	public Integer getTheNumber() {
		return this.theNumber;
	}
	
	public void setPackageNum(double packageNum) {
		this.packageNum = packageNum;
	}
	
	/**
	 * 返回 件数
	 * @return
	 */
	public double getPackageNum() {
		return this.packageNum;
	}
	
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	/**
	 * 返回 含税单价
	 * @return
	 */
	public Double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setSumPrice(Double sumPrice) {
		this.sumPrice = sumPrice;
	}
	
	/**
	 * 返回 总价
	 * @return
	 */
	public Double getSumPrice() {
		return this.sumPrice;
	}
	
	public void setSurplusSUm(Integer surplusSUm) {
		this.surplusSUm = surplusSUm;
	}
	
	/**
	 * 返回 剩余数量
	 * @return
	 */
	public Integer getSurplusSUm() {
		return this.surplusSUm;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("EveryDayContractId", this.EveryDayContractId) 
		.append("productGauge", this.productGauge) 
		.append("MedicineType", this.MedicineType) 
		.append("commonName", this.commonName) 
		.append("unit", this.unit) 
		.append("Achange", this.achage) 
		.append("suppyType", this.suppyType) 
		.append("suggestApplyNum", this.suggestApplyNum) 
		.append("lastShipmentDate", this.lastShipmentDate) 
		.append("SMSCurrentMonthSales", this.SMSCurrentMonthSales) 
		.append("productCode", this.productCode) 
		.append("isSMS", this.isSMS) 
		.append("theNumber", this.theNumber) 
		.append("packageNum", this.packageNum) 
		.append("unitPrice", this.unitPrice) 
		.append("sumPrice", this.sumPrice) 
		.append("surplusSUm", this.surplusSUm) 
		.toString();
	}
}