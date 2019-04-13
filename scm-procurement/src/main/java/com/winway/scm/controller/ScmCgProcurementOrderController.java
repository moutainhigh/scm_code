package com.winway.scm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.hotent.base.annotation.Workflow;
import com.hotent.base.controller.BaseController;
import com.hotent.base.feign.UCFeignService;
import com.hotent.base.model.CommonResult;
import com.hotent.base.model.WinwayResult;
import com.hotent.base.query.PageList;
import com.hotent.base.query.QueryFilter;
import com.hotent.base.util.JsonUtil;
import com.hotent.base.util.StringUtil;
import com.winway.scm.model.ScmCgProOrderProduct;
import com.winway.scm.model.ScmCgProcurementOrder;
import com.winway.scm.persistence.manager.ScmCgProOrderProductManager;
import com.winway.scm.persistence.manager.ScmCgProcurementContractManager;
import com.winway.scm.persistence.manager.ScmCgProcurementOrderManager;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * <pre> 
 * 描述：采购订单表 控制器类
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2018-12-26 13:47:44
 * 版权：讯宜捷科技有限公司
 * </pre>
 */
@RestController
@RequestMapping(value="/scm/scmCgProcurementOrder/v1",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(tags="scmCgProcurementOrderController 采购订单")
public class ScmCgProcurementOrderController extends BaseController{
	@Resource
	ScmCgProcurementOrderManager scmCgProcurementOrderManager;
	@Resource
	ScmCgProcurementContractManager scmCgProcurementContractManager;
	@Resource
	ScmCgProOrderProductManager scmCgProOrderProductManager;
	@Resource
	UCFeignService ucFeignService; 
	/**
	 * 采购订单表列表(分页条件查询)数据
	 * @param request
	 * @return
	 * @throws Exception 
	 * PageJson
	 * @exception 
	 */
	@PostMapping("/list")
	@ApiOperation(value="采购订单表数据列表", httpMethod = "POST", notes = "获取采购订单表列表")
	public PageList<ScmCgProcurementOrder> list(@ApiParam(name="queryFilter",value="查询对象")@RequestBody QueryFilter queryFilter) throws Exception{
		return scmCgProcurementOrderManager.query(queryFilter);
	}
	
	/**
	 * 采购订单表明细页面
	 * @param id
	 * @return
	 * @throws Exception 
	 * ModelAndView
	 */
	@GetMapping(value="/get/{id}")
	@ApiOperation(value="采购订单表数据详情",httpMethod = "GET",notes = "采购订单表数据详情")
	public ScmCgProcurementOrder get(@ApiParam(name="id",value="业务对象主键", required = true)@PathVariable String id) throws Exception{
		ScmCgProcurementOrder scmCgProcurementOrder = scmCgProcurementOrderManager.get(id);
		List<ScmCgProOrderProduct> list = scmCgProOrderProductManager.getByMainId(id);
		scmCgProcurementOrder.setScmCgProOrderProductList(list);
		return scmCgProcurementOrder;
	}
	
    /**
	 * 新增采购订单表
	 * @param scmCgProcurementOrder
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@PostMapping(value="save")
	@ApiOperation(value = "新增,更新采购订单表数据", httpMethod = "POST", notes = "新增,更新采购订单表数据")
	public CommonResult<String> save(@ApiParam(name="scmCgProcurementOrder",value="采购订单表业务对象", required = true)@RequestBody ScmCgProcurementOrder scmCgProcurementOrder) throws Exception{
		String msg = "添加采购订单表成功";
		JsonNode user = ucFeignService.getUser(current(), "");
		String fullname = user.get("fullname").asText();
		String id = user.get("id").asText();
		scmCgProcurementOrder.setOperatorName(fullname);
		scmCgProcurementOrder.setOperatorId(id);
		if(StringUtil.isEmpty(scmCgProcurementOrder.getId())){
			scmCgProcurementOrderManager.create(scmCgProcurementOrder);
		}else{
			scmCgProcurementOrderManager.update(scmCgProcurementOrder);
			msg = "更新采购订单表成功";
		}
		return new CommonResult<String>(true,msg,scmCgProcurementOrder.getId()); 
	}
	
	/**
	 * 删除采购订单表记录
	 * @param id
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@DeleteMapping(value="remove/{id}")
	@ApiOperation(value = "删除采购订单表记录", httpMethod = "DELETE", notes = "删除采购订单表记录")
	public  CommonResult<String>  remove(@ApiParam(name="id",value="业务主键", required = true)@PathVariable String id) throws Exception{
		scmCgProcurementOrderManager.remove(id);
		return new CommonResult<String>(true, "删除成功");
	}
	
	/**
	 * 批量删除采购订单表记录
	 * @param ids
	 * @throws Exception 
	 * @return
	 * @exception 
	 */
	@DeleteMapping(value="/removes")
	@ApiOperation(value = "批量删除采购订单表记录", httpMethod = "DELETE", notes = "批量删除采购订单表记录")
	public CommonResult<String> removes(@ApiParam(name="ids",value="业务主键数组,多个业务主键之间用逗号分隔", required = true)@RequestParam String...ids) throws Exception{
		scmCgProcurementOrderManager.removeByIds(ids);
		return new CommonResult<String>(true, "批量删除成功");
	}
	
	/**
	 * @param 采购订单申请
	 * @param request
	 * @return
	 * @throws Exception
	 * flowKey:审批类型
	 * sysCode:系统别名
	 * instanceIdField:与实体类审批ID相同,controller层接到对象会有审批ID,处理业务逻辑后,保存对象即可
	 * varKeys:脚本使用参数
	 */
	@PostMapping(value = "sendApply")
    @ApiOperation(value = "采购订单申请", httpMethod = "POST", notes = "采购订单流程提交")
    @Workflow(flowKey = "cgdd", sysCode = "SCM", instanceIdField = "approvalId", varKeys = {})
    public WinwayResult<String> sendApply(
            @ApiParam(name = "scmCgProcurementOrder", value = "采购合同对象", required = true) @RequestBody ScmCgProcurementOrder scmCgProcurementOrder,
            HttpServletRequest request) throws Exception {
		scmCgProcurementOrderManager.sendApply(scmCgProcurementOrder);
	   return new WinwayResult<>("true", "申请提交成功");
	}
	
	/**
	 * 采购订单,补单,详情
	 * @param request
	 * @return
	 * @throws Exception 
	 * PageJson
	 * @exception 
	 */
	@GetMapping("/getOrderAndRepOrder/{id}")
	@ApiOperation(value="采购订单,补单,详情", httpMethod = "GET", notes = "采购订单,补单,详情")
	public ScmCgProcurementOrder getOrderAndRepOrder(@ApiParam(name="id",value="采购订单ID")
		@PathVariable String id) throws Exception{		
		return scmCgProcurementOrderManager.getOrderAndRepOrder(id);
	}
	
    @PostMapping(value = "/endApply")
    @ApiOperation(value = "采购订单审批流程通过", httpMethod = "POST", notes = "采购订单审批流程通过,修改审批状态")
    public void endApply(@ApiParam(name = "params", value = "流程事件参数", required = true) @RequestBody String params, 
    		HttpServletRequest request) throws Exception {
    	JsonNode jsonNode = JsonUtil.toJsonNode(params);
    	scmCgProcurementOrderManager.endApply(jsonNode);
    }
    
	/**
	 * 根据审批ID获取详细数据
	 * 在供应商实体类 与mapper文件中添加一对多与一对多关系,委托书未生成
	 * @param id
	 * @return
	 * @throws Exception 
	 * ModelAndView
	 */
	@GetMapping(value="/getOrderFirstByApprovalId/{approvalId}")
	@ApiOperation(value="根据审批ID获取详细数据",httpMethod = "GET",notes = "根据审批ID获取详细数据")
	public CommonResult<ScmCgProcurementOrder> getOrderFirstByApprovalId(@ApiParam(name="approvalId",value="审批ID", required = true)@PathVariable String approvalId) throws Exception{
		ScmCgProcurementOrder scmCgProcurementOrder = scmCgProcurementOrderManager.getOrderFirstByApprovalId(approvalId);
		return new CommonResult<ScmCgProcurementOrder>(true,"获取成功",scmCgProcurementOrder);
	}
    
}
