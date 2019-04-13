package com.winway.scm.persistence.manager;

import com.hotent.base.manager.Manager;
import com.winway.scm.model.ScmZsjSupplierEntruseBook;

/**
 * 
 * <pre> 
 * 描述：供应商委托书 处理接口
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-01-03 09:41:54
 * 版权：美达开发小组
 * </pre>
 */
public interface ScmZsjSupplierEntruseBookManager extends Manager<String, ScmZsjSupplierEntruseBook>{
	
	void create(ScmZsjSupplierEntruseBook scmZsjSupplierEntruseBook);
}
