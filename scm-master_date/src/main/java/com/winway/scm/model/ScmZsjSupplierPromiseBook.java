package com.winway.scm.model;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotent.base.model.BaseModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


 /**
 * 供应商承诺书
 * <pre> 
 * 描述：供应商承诺书 实体对象
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-01-03 09:41:54
 * 版权：美达开发小组
 * </pre>
 */
 @ApiModel(value = "ScmZsjSupplierPromiseBook",description = "供应商承诺书") 
public class ScmZsjSupplierPromiseBook extends BaseModel<String>{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="id")
	protected String id; 
	
	@ApiModelProperty(value="首营ID")
	protected String supplierFirstId; 
	
	@ApiModelProperty(value="承诺书ID")
	protected String PromiseBookId; 
	
	@ApiModelProperty(value="是否存在")
	protected String isExist; 
	
	@ApiModelProperty(value="有效期")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	protected java.util.Date validity; 
	
	protected ScmZdPromiseBook scmZdPromiseBook;
	
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
	
	public void setPromiseBookId(String PromiseBookId) {
		this.PromiseBookId = PromiseBookId;
	}
	
	/**
	 * 返回 承诺书ID
	 * @return
	 */
	public String getPromiseBookId() {
		return this.PromiseBookId;
	}
	
	public void setIsExist(String isExist) {
		this.isExist = isExist;
	}
	
	/**
	 * 返回 是否存在
	 * @return
	 */
	public String getIsExist() {
		return this.isExist;
	}
	
	public void setValidity(java.util.Date validity) {
		this.validity = validity;
	}
	
	/**
	 * 返回 有效期
	 * @return
	 */
	public java.util.Date getValidity() {
		return this.validity;
	}

	


	public ScmZdPromiseBook getScmZdPromiseBook() {
		return scmZdPromiseBook;
	}

	public void setScmZdPromiseBook(ScmZdPromiseBook scmZdPromiseBook) {
		this.scmZdPromiseBook = scmZdPromiseBook;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("supplierFirstId", this.supplierFirstId) 
		.append("PromiseBookId", this.PromiseBookId) 
		.append("isExist", this.isExist) 
		.append("validity", this.validity) 
		.toString();
	}
}