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

import com.zzj.entity.DArea;
import com.zzj.service.DAreaService;
import com.zzj.util.ExceptionMessage;

@Controller
@RequestMapping(value="area")
public class DAreaController {
	
	private Logger logger = Logger.getLogger(ExpertController.class);
	
	@Autowired
	private DAreaService dAreaService;
	
	/**
	   * 查询所有一级行业
	   *@author: dengliaohang
	   *@date： 日期：2017-10-25 时间：下午4:02:13
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectAllFirstDArea",method = RequestMethod.GET)
	  public Map<String, Object> selectAllFirstDArea(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入查询所有一级行业方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<DArea> dAreas=new ArrayList<DArea>();
		  try{
			  String classId="1";
			  dAreas = dAreaService.selectAllFirstDArea(classId);
			  em.setMessage("查询所有一级行业") ;
		  }catch (Exception e) {
				em.setMessage("查询所有一级行业时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", dAreas);
		  logger.info(em.getMessage()) ;
		  logger.info("结束查询所有一级行业方法");
		  return map;
	  } 
	  
	  /**
	   * 根据一级查询二级行业
	   *@author: dengliaohang
	   *@date： 日期：2017-10-25 时间：下午4:06:59
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectAllDAreaByFirstCode",method = RequestMethod.GET)
	  public Map<String, Object> selectAllDAreaByFirstCode(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据一级查询二级行业方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<DArea> dAreas=new ArrayList<DArea>();
		  String firstCode="";
		  try{
			  dAreas=dAreaService.selectAllDAreaByFirstCode(firstCode);
			  em.setMessage("根据一级查询二级行业") ;
		  }catch (Exception e) {
				em.setMessage("根据一级查询二级行业时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", dAreas);
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据一级查询二级行业方法");
		  return map;
	  } 
	

}
