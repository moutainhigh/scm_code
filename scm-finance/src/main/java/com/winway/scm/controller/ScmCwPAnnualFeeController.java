package com.winway.scm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
import com.winway.scm.persistence.manager.ScmCwPAnnualFeeManager;
import com.winway.scm.model.ScmCwPAnnualFee;
import com.hotent.base.controller.BaseController;
import com.hotent.base.model.CommonResult;
import com.hotent.base.query.PageList;
import com.hotent.base.query.QueryFilter;
import com.hotent.base.util.StringUtil;

/**
 * 
 * <pre> 
 * 描述：经销商RB支付年费信息管理费 控制器类
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-05-09 18:18:05
 * 版权：美达开发小组
 * </pre>
 */
@RestController
@RequestMapping(value="/scm/scmCwPAnnualFee/v1",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(tags="scmCwPAnnualFeeController 经销商RB支付年费信息管理费 ")
public class ScmCwPAnnualFeeController extends BaseController{
	@Resource
	ScmCwPAnnualFeeManager scmCwPAnnualFeeManager;
	
	/**
	 * 经销商RB支付年费信息管理费列表(分页条件查询)数据
	 * @param request
	 * @return
	 * @throws Exception 
	 * PageJson
	 * @exception 
	 */
	@PostMapping("/list")
	@ApiOperation(value="经销商RB支付年费信息管理费数据列表", httpMethod = "POST", notes = "获取经销商RB支付年费信息管理费列表")
	public PageList<ScmCwPAnnualFee> list(@ApiParam(name="queryFilter",value="查询对象")@RequestBody QueryFilter queryFilter) throws Exception{
		return scmCwPAnnualFeeManager.query(queryFilter);
	}
	
	/**
	 * 经销商RB支付年费信息管理费明细页面
	 * @param id
	 * @return
	 * @throws Exception 
	 * ModelAndView
	 */
	@GetMapping(value="/get/{id}")
	@ApiOperation(value="经销商RB支付年费信息管理费数据详情",httpMethod = "GET",notes = "经销商RB支付年费信息管理费数据详情")
	public ScmCwPAnnualFee get(@ApiParam(name="id",value="业务对象主键", required = true)@PathVariable String id) throws Exception{
		return scmCwPAnnualFeeManager.get(id);
	}
	
    /**
	 * 新增经销商RB支付年费信息管理费
	 * @param scmCwPAnnualFee
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@PostMapping(value="save")
	@ApiOperation(value = "新增,更新经销商RB支付年费信息管理费数据", httpMethod = "POST", notes = "新增,更新经销商RB支付年费信息管理费数据")
	public CommonResult<String> save(@ApiParam(name="scmCwPAnnualFee",value="经销商RB支付年费信息管理费业务对象", required = true)@RequestBody ScmCwPAnnualFee scmCwPAnnualFee) throws Exception{
		String msg = "添加经销商RB支付年费信息管理费成功";
		if(StringUtil.isEmpty(scmCwPAnnualFee.getId())){
			scmCwPAnnualFeeManager.create(scmCwPAnnualFee);
		}else{
			scmCwPAnnualFeeManager.update(scmCwPAnnualFee);
			 msg = "更新经销商RB支付年费信息管理费成功";
		}
		return new CommonResult<String>(msg);
	}
	
	/**
	 * 删除经销商RB支付年费信息管理费记录
	 * @param id
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@DeleteMapping(value="remove/{id}")
	@ApiOperation(value = "删除经销商RB支付年费信息管理费记录", httpMethod = "DELETE", notes = "删除经销商RB支付年费信息管理费记录")
	public  CommonResult<String>  remove(@ApiParam(name="id",value="业务主键", required = true)@PathVariable String id) throws Exception{
		scmCwPAnnualFeeManager.remove(id);
		return new CommonResult<String>(true, "删除成功");
	}
	
	/**
	 * 批量删除经销商RB支付年费信息管理费记录
	 * @param ids
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@DeleteMapping(value="/removes")
	@ApiOperation(value = "批量删除经销商RB支付年费信息管理费记录", httpMethod = "DELETE", notes = "批量删除经销商RB支付年费信息管理费记录")
	public CommonResult<String> removes(@ApiParam(name="ids",value="业务主键数组,多个业务主键之间用逗号分隔", required = true)@RequestParam String...ids) throws Exception{
		scmCwPAnnualFeeManager.removeByIds(ids);
		return new CommonResult<String>(true, "批量删除成功");
	}
}
