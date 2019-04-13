package com.winway.scm.model;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotent.base.model.BaseModel;


 /**
 * 供应商GMP证书信息
 * <pre> 
 * 描述：供应商GMP证书信息 实体对象
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-01-03 09:41:54
 * 版权：美达开发小组
 * </pre>
 */
 @ApiModel(value = "ScmZsjGMP",description = "供应商GMP证书信息") 
public class ScmZsjGMP extends BaseModel<String>{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="id")
	protected String id; 
	
	@ApiModelProperty(value="首营ID")
	protected String supplierFirstId; 
	
	@ApiModelProperty(value="GMP证书")
	protected String GMPCertificate; 
	
	@ApiModelProperty(value="GMP证书有效期")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	protected java.util.Date validity; 
	
	@ApiModelProperty(value="GMP证书认证范围")
	protected String certificationScope; 
	
	
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
	
	public void setSupplierFirstId(String supplierFirstId) {
		this.supplierFirstId = supplierFirstId;
	}
	
	/**
	 * 返回 首营ID
	 * @return
	 */
	public String getSupplierFirstId() {
		return this.supplierFirstId;
	}
	
	public void setGMPCertificate(String GMPCertificate) {
		this.GMPCertificate = GMPCertificate;
	}
	
	/**
	 * 返回 GMP证书
	 * @return
	 */
	public String getGMPCertificate() {
		return this.GMPCertificate;
	}
	
	public void setValidity(java.util.Date validity) {
		this.validity = validity;
	}
	
	/**
	 * 返回 GMP证书有效期
	 * @return
	 */
	public java.util.Date getValidity() {
		return this.validity;
	}
	
	public void setCertificationScope(String certificationScope) {
		this.certificationScope = certificationScope;
	}
	
	/**
	 * 返回 GMP证书认证范围
	 * @return
	 */
	public String getCertificationScope() {
		return this.certificationScope;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("supplierFirstId", this.supplierFirstId) 
		.append("GMPCertificate", this.GMPCertificate) 
		.append("validity", this.validity) 
		.append("certificationScope", this.certificationScope) 
		.toString();
	}
}