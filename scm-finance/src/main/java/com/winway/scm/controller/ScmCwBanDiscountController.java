package com.winway.scm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.Date;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.winway.scm.persistence.manager.ScmCwBanDiscountManager;
import com.winway.scm.model.ScmCwBanDiscount;
import com.fasterxml.jackson.databind.JsonNode;
import com.hotent.base.controller.BaseController;
import com.hotent.base.feign.UCFeignService;
import com.hotent.base.model.CommonResult;
import com.hotent.base.query.PageList;
import com.hotent.base.query.QueryFilter;
import com.hotent.base.util.StringUtil;

/**
 * 
 * <pre> 
 * 描述：禁止票折规则表 控制器类
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-04-27 11:30:57
 * 版权：美达开发小组
 * </pre>
 */
@RestController
@RequestMapping(value="/scm/scmCwBanDiscount/v1",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(tags="scmCwBanDiscountController 禁止票折规则")
public class ScmCwBanDiscountController extends BaseController{
	@Resource
	ScmCwBanDiscountManager scmCwBanDiscountManager;
	@Resource
	UCFeignService ucFeignService;
	
	/**
	 * 禁止票折规则表列表(分页条件查询)数据
	 * @param request
	 * @return
	 * @throws Exception 
	 * PageJson
	 * @exception 
	 */
	@PostMapping("/list")
	@ApiOperation(value="禁止票折规则表数据列表", httpMethod = "POST", notes = "获取禁止票折规则表列表")
	public PageList<ScmCwBanDiscount> list(@ApiParam(name="queryFilter",value="查询对象")@RequestBody QueryFilter queryFilter) throws Exception{
		return scmCwBanDiscountManager.query(queryFilter);
	}
	
	/**
	 * 禁止票折规则表明细页面
	 * @param id
	 * @return
	 * @throws Exception 
	 * ModelAndView
	 */
	@GetMapping(value="/get/{id}")
	@ApiOperation(value="禁止票折规则表数据详情",httpMethod = "GET",notes = "禁止票折规则表数据详情")
	public ScmCwBanDiscount get(@ApiParam(name="id",value="业务对象主键", required = true)@PathVariable String id) throws Exception{
		return scmCwBanDiscountManager.get(id);
	}
	
    /**
	 * 新增禁止票折规则表
	 * @param scmCwBanDiscount
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@PostMapping(value="save")
	@ApiOperation(value = "新增,更新禁止票折规则表数据", httpMethod = "POST", notes = "新增,更新禁止票折规则表数据")
	public CommonResult<String> save(@ApiParam(name="scmCwBanDiscount",value="禁止票折规则表业务对象", required = true)@RequestBody ScmCwBanDiscount scmCwBanDiscount) throws Exception{
		if(scmCwBanDiscount.getOwnerId() == null|| "".equals(scmCwBanDiscount.getOwnerId()) || "null".equals(scmCwBanDiscount.getOwnerId())) {
			throw new RuntimeException("货主ID不能为空");
		}
		String msg = "添加禁止票折规则表成功";
		if(StringUtil.isEmpty(scmCwBanDiscount.getId())){
			JsonNode user = ucFeignService.getUser(current(), "");
		    String fullname = user.get("fullname").asText();
		    scmCwBanDiscount.setSetPersion(fullname);
		    scmCwBanDiscount.setSetTime(new Date());
			scmCwBanDiscountManager.create(scmCwBanDiscount);
		}else{
			scmCwBanDiscountManager.update(scmCwBanDiscount);
			 msg = "更新禁止票折规则表成功";
		}
		return new CommonResult<String>(msg);
	}
	
	/**
	 * 删除禁止票折规则表记录
	 * @param id
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@DeleteMapping(value="remove/{id}")
	@ApiOperation(value = "删除禁止票折规则表记录", httpMethod = "DELETE", notes = "删除禁止票折规则表记录")
	public  CommonResult<String>  remove(@ApiParam(name="id",value="业务主键", required = true)@PathVariable String id) throws Exception{
		scmCwBanDiscountManager.remove(id);
		return new CommonResult<String>(true, "删除成功");
	}
	
	/**
	 * 批量删除禁止票折规则表记录
	 * @param ids
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@DeleteMapping(value="/removes")
	@ApiOperation(value = "批量删除禁止票折规则表记录", httpMethod = "DELETE", notes = "批量删除禁止票折规则表记录")
	public CommonResult<String> removes(@ApiParam(name="ids",value="业务主键数组,多个业务主键之间用逗号分隔", required = true)@RequestParam String...ids) throws Exception{
		scmCwBanDiscountManager.removeByIds(ids);
		return new CommonResult<String>(true, "批量删除成功");
	}
}
