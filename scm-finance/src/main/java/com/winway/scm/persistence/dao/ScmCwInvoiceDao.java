package com.winway.scm.persistence.dao;
import java.util.List;
import java.util.Map;

import com.hotent.base.dao.MyBatisDao;
import com.winway.scm.model.ScmCwInvoice;
import com.winway.scm.vo.VInvoice;

/**
 * 
 * <pre> 
 * 描述：商业发票表 DAO接口
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-03-23 18:19:25
 * 版权：美达开发小组
 * </pre>
 */
public interface ScmCwInvoiceDao extends MyBatisDao<String, ScmCwInvoice> {

	List<ScmCwInvoice> selAll(Map<String, Object> params);

	List<VInvoice> history(Map<String, Object> params);
}
