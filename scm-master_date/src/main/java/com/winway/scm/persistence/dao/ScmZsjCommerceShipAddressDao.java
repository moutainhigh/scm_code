package com.winway.scm.persistence.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hotent.base.dao.MyBatisDao;
import com.winway.scm.model.ScmZsjCommerceShipAddress;

/**
 * 
 * <pre> 
 * 描述：商业收货地址 DAO接口
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-01-03 09:41:54
 * 版权：美达开发小组
 * </pre>
 */
public interface ScmZsjCommerceShipAddressDao extends MyBatisDao<String, ScmZsjCommerceShipAddress> {
	/**
	 * 根据外键获取子表明细列表
	 * @param commerceFirstId
	 * @return
	 */
	public List<ScmZsjCommerceShipAddress> getByMainId(String commerceFirstId);
	
	/**
	 * 根据外键删除子表记录
	 * @param commerceFirstId
	 * @return
	 */
	public void delByMainId(String commerceFirstId);
	
}
