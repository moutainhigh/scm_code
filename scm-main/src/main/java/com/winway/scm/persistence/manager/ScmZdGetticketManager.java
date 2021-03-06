package com.winway.scm.persistence.manager;

import com.hotent.base.manager.Manager;
import com.winway.scm.model.ScmZdGetticket;

/**
 * 
 * <pre> 
 * 描述：收票方 处理接口
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2018-12-29 10:31:24
 * 版权：美达项目组
 * </pre>
 */
public interface ScmZdGetticketManager extends Manager<String, ScmZdGetticket>{

	void getByNameAndCodeOrId(ScmZdGetticket scmZdGetticket);
	
}
