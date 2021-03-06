package com.winway.scm.print;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.winway.purchase.print.jasperreport.PrintBase;
import com.winway.purchase.print.jasperreport.PrintObject;
import com.winway.purchase.util.MoneyStringUtil;
import com.winway.scm.persistence.dao.ScmXsEveryDayContractDao;
import com.winway.scm.persistence.dao.ScmXsEveryDayContractProductDao;

@Component("ScmXsEverydaycontractPrint")
public class ScmXsEverydaycontractPrint extends PrintBase {
	@Resource
	ScmXsEveryDayContractDao scmXsEveryDayContractDao;
	@Resource
	ScmXsEveryDayContractProductDao scmXsEveryDayContractProductDao;
	@Override
	public List<PrintObject> getPrintData(Map<String, Object> map) {
		BufferedImage img_ht = null;
		ClassPathResource mbResource = new ClassPathResource("jaspertemplate" + File.separator + "imgs" + File.separator + "ht_img.png");
//		try {
//			mbResource.getFile();	
//		}catch(IOException e) {
//			throw new RuntimeException("合同章图片不存在");
//		}
		try {
			InputStream is = mbResource.getInputStream();
			img_ht = ImageIO.read(is);
		} catch (IOException e) {
			throw new RuntimeException("合同章图片读取失败");
		}
		if(!map.containsKey("ID")) {
			throw new RuntimeException("日常合同ID参数错误");
		}
		String id =String.valueOf(map.get("ID"));
		Map parameters1 = new HashMap(10);
		
		Map mapMain = scmXsEveryDayContractDao.getScmXsEverydaycontractPrint(id);
		List<PrintObject> exports = new ArrayList<PrintObject>();
		PrintObject printObject1 = new PrintObject();
		printObject1.setPrintMbname("scm_xs_everydaycontract");
		parameters1.putAll(mapMain);
		
		Map mapMainsum = scmXsEveryDayContractProductDao.getScmXsEverydaycontractPrintDetail(id);
		parameters1.putAll(mapMainsum);
		Double sumsumPrice = Double.parseDouble(String.valueOf(mapMainsum.get("sumsumPrice")));
		
		parameters1.put("sumsumPriceChina", MoneyStringUtil.change(sumsumPrice));
		parameters1.put("img_ht", img_ht);
		printObject1.setParameters(parameters1);
		
		List<Map> detail = scmXsEveryDayContractProductDao.getDetail(id);
		printObject1.setDatasource(detail);
		exports.add(printObject1);
		return exports;
	}

	@Override
	public boolean beforePrint(Map<String, Object> map) {
		return false;
	}

	@Override
	public void afterPrint(Map<String, Object> map) {

	}

}
