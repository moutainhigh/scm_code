package com.winway.scm.model;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotent.base.model.BaseModel;


 /**
 * 商业GSP证书信息
 * <pre> 
 * 描述：商业GSP证书信息 实体对象
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-01-03 09:41:54
 * 版权：美达开发小组
 * </pre>
 */
 @ApiModel(value = "ScmZsjGSP",description = "商业GSP证书信息") 
public class ScmZsjGSP extends BaseModel<String>{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="id")
	protected String id; 
	
	@ApiModelProperty(value="首营ID")
	protected String commerceFirstId; 
	
	@ApiModelProperty(value="GSP证书")
	protected String GSP; 
	
	@ApiModelProperty(value="GSP证书有效期")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	protected java.util.Date validity; 
	
	
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
	
	public void setCommerceFirstId(String commerceFirstId) {
		this.commerceFirstId = commerceFirstId;
	}
	
	/**
	 * 返回 首营ID
	 * @return
	 */
	public String getCommerceFirstId() {
		return this.commerceFirstId;
	}
	
	public void setGSP(String GSP) {
		this.GSP = GSP;
	}
	
	/**
	 * 返回 GSP证书
	 * @return
	 */
	public String getGSP() {
		return this.GSP;
	}
	
	public void setValidity(java.util.Date validity) {
		this.validity = validity;
	}
	
	/**
	 * 返回 GSP证书有效期
	 * @return
	 */
	public java.util.Date getValidity() {
		return this.validity;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("commerceFirstId", this.commerceFirstId) 
		.append("GSP", this.GSP) 
		.append("validity", this.validity) 
		.toString();
	}
}