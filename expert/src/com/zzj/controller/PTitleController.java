package com.zzj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzj.entity.DRegion;
import com.zzj.entity.PTitle;
import com.zzj.service.PTitleService;
import com.zzj.util.ExceptionMessage;


@Controller
@RequestMapping(value="ptitle")
public class PTitleController {

	@Autowired
	private PTitleService pTitleService;
	
	private Logger logger = Logger.getLogger(PTitleController.class);
	
	/**
	 * 查询一级职业菜单
	 *@author: dengliaohang
	 *@date： 日期：2017-10-27 时间：上午9:27:37
	 *@param request
	 *@param response
	 *@return
	 */
	@ResponseBody
	@RequestMapping(value="/selectPTitleByLevel",method = RequestMethod.GET)
	public Map<String, Object> selectPTitleByLevel(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入查询一级职业菜单方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<PTitle> ptitles=new ArrayList<PTitle>();
		  try{
			  //dRegions=dRegionService.selectAllDRegionBySecondCode(dRegion);
			  ptitles= pTitleService.selectPTitleByLevel("0");
			  em.setMessage("查询一级职业菜单") ;
		  }catch (Exception e) {
				em.setMessage("查询一级职业菜单时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", ptitles);
		  logger.info(em.getMessage()) ;
		  logger.info("结束查询一级职业菜单方法");
		  return map;
		
	}
	
	
	/**
	 * 查询二级三级职业菜单
	 * 根据level和code查询
	 *@author: dengliaohang
	 *@date： 日期：2017-10-27 时间：上午9:30:30
	 *@param request
	 *@param response
	 *@return
	 */
	@ResponseBody
	@RequestMapping(value="/selectPTitleByCode",method = RequestMethod.GET)
	public Map<String, Object> selectPTitleByCode(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入查询二级三级职业菜单方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<PTitle> ptitles=new ArrayList<PTitle>();
		  try{
			  //dRegions=dRegionService.selectAllDRegionBySecondCode(dRegion);
			  //ptitles= pTitleService.selectPTitleByCode(level,parentCode);
			  em.setMessage("查询二级三级职业菜单") ;
		  }catch (Exception e) {
				em.setMessage("查询二级三级职业菜单时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", ptitles);
		  logger.info(em.getMessage()) ;
		  logger.info("结束查询二级三级职业菜单方法");
		  return map;
		
	}
	
	
	
	
}
