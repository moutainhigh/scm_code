package com.winway.scm.model;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.hotent.base.model.BaseModel;


 /**
 * 动态票折规则
 * <pre> 
 * 描述：动态票折规则 实体对象
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-03-23 18:19:26
 * 版权：美达开发小组
 * </pre>
 */
 @ApiModel(value = "ScmCwDynamicDiscount",description = "动态票折规则") 
public class ScmCwDynamicDiscount extends BaseModel<String>{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="id")
	protected String id; 
	
	@ApiModelProperty(value="商品ID")
	protected String productId; 
	
	@ApiModelProperty(value="商品编号")
	protected String productCode; 
	
	@ApiModelProperty(value="商品名称")
	protected String productName; 
	
	@ApiModelProperty(value="商品数量")
	protected Integer productSum; 
	
	@ApiModelProperty(value="可票折百分比")
	protected Integer mayDeductionPercent; 
	
	@ApiModelProperty(value="票折时间起")
	protected java.util.Date deductionDateStart; 
	
	@ApiModelProperty(value="票折时间止")
	protected java.util.Date deductionDateStop; 
	
	@ApiModelProperty(value="是否失效")
	protected String isLoseEfficacy; 
	
	@ApiModelProperty(value="设置人")
	protected String setPersion; 
	
	@ApiModelProperty(value="设置时间")
	protected java.util.Date setTime; 
	
	@ApiModelProperty(value="货主ID")
	protected String ownerId;

	 @ApiModelProperty(value="是否删除 0:正常 1：删除" )
	 protected String isDelete;

	 @ApiModelProperty(value="规则使用结束后是否正常票折（0：正常票折，1：禁止票折）")
	 protected String state;



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
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	/**
	 * 返回 商品ID
	 * @return
	 */
	public String getProductId() {
		return this.productId;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	/**
	 * 返回 商品编号
	 * @return
	 */
	public String getProductCode() {
		return this.productCode;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * 返回 商品名称
	 * @return
	 */
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductSum(Integer productSum) {
		this.productSum = productSum;
	}
	
	/**
	 * 返回 商品数量
	 * @return
	 */
	public Integer getProductSum() {
		return this.productSum;
	}
	
	public void setMayDeductionPercent(Integer mayDeductionPercent) {
		this.mayDeductionPercent = mayDeductionPercent;
	}
	
	/**
	 * 返回 可票折百分比
	 * @return
	 */
	public Integer getMayDeductionPercent() {
		return this.mayDeductionPercent;
	}
	
	public void setDeductionDateStart(java.util.Date deductionDateStart) {
		this.deductionDateStart = deductionDateStart;
	}
	
	/**
	 * 返回 票折时间起
	 * @return
	 */
	public java.util.Date getDeductionDateStart() {
		return this.deductionDateStart;
	}
	
	public void setDeductionDateStop(java.util.Date deductionDateStop) {
		this.deductionDateStop = deductionDateStop;
	}
	
	/**
	 * 返回 票折时间止
	 * @return
	 */
	public java.util.Date getDeductionDateStop() {
		return this.deductionDateStop;
	}
	
	public void setIsLoseEfficacy(String isLoseEfficacy) {
		this.isLoseEfficacy = isLoseEfficacy;
	}
	
	/**
	 * 返回 是否失效
	 * @return
	 */
	public String getIsLoseEfficacy() {
		return this.isLoseEfficacy;
	}
	
	public void setSetPersion(String setPersion) {
		this.setPersion = setPersion;
	}
	
	/**
	 * 返回 设置人
	 * @return
	 */
	public String getSetPersion() {
		return this.setPersion;
	}
	
	public void setSetTime(java.util.Date setTime) {
		this.setTime = setTime;
	}
	
	/**
	 * 返回 设置时间
	 * @return
	 */
	public java.util.Date getSetTime() {
		return this.setTime;
	}
	
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * 返回 货主ID
	 * @return
	 */
	public String getOwnerId() {
		return this.ownerId;
	}

	 /**
	  * 返回删除状态值
	  * @return
	  */
	 public String getIsDelete() {
		 return isDelete;
	 }

	 public void setIsDelete(String isDelete) {
		 this.isDelete = isDelete;
	 }

	 /**
	  * 返回状态
	  * @return
	  */
	 public String getState() {
		 return state;
	 }

	 public void setState(String state) {
		 this.state = state;
	 }

	 /**
	  * @see Object#toString()
	  */
	 @Override
	 public String toString() {
		 return "ScmCwDynamicDiscount{" +
				 "id='" + id + '\'' +
				 ", productId='" + productId + '\'' +
				 ", productCode='" + productCode + '\'' +
				 ", productName='" + productName + '\'' +
				 ", productSum=" + productSum +
				 ", mayDeductionPercent=" + mayDeductionPercent +
				 ", deductionDateStart=" + deductionDateStart +
				 ", deductionDateStop=" + deductionDateStop +
				 ", isLoseEfficacy='" + isLoseEfficacy + '\'' +
				 ", setPersion='" + setPersion + '\'' +
				 ", setTime=" + setTime +
				 ", ownerId='" + ownerId + '\'' +
				 ", isDelete='" + isDelete + '\'' +
				 ", state='" + state + '\'' +
				 '}';
	 }
 }