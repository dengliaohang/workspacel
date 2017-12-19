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
import com.zzj.service.DRegionService;
import com.zzj.util.ExceptionMessage;


@Controller
@RequestMapping(value="region")
public class DRegionController {

	private Logger logger = Logger.getLogger(DRegionController.class);
	
	@Autowired
	private DRegionService dRegionService;
	
	 /**
	   * 查询一级地名
	   *@author: dengliaohang
	   *@date： 日期：2017-10-25 时间：下午3:14:30
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectAllFirstDRegion",method = RequestMethod.GET)
	  public Map<String, Object> selectAllFirstDRegion(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入查询一级地名方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<DRegion> dRegions=new ArrayList<DRegion>();
		  try{
			  dRegions=dRegionService.selectAllFirstDRegion();
			  em.setMessage("查询一级地名") ;
		  }catch (Exception e) {
				em.setMessage("查询一级地名时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", dRegions);
		  logger.info(em.getMessage()) ;
		  logger.info("结束查询一级地名方法");
		  return map;
	  } 
	  	
	  /**
	   * 
	   * 根据一级查询二级地名
	   *@author: dengliaohang
	   *@date： 日期：2017-10-25 时间：下午3:20:33
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectAllDRegionByFirstCode",method = RequestMethod.GET)
	  public Map<String, Object> selectAllDRegionByFirstCode(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据一级查询二级地名方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<DRegion> dRegions=new ArrayList<DRegion>();
		  DRegion dRegion=new DRegion();
		  String zoneCode=request.getParameter("zoneCode");
		  String classId=request.getParameter("classId");
		  try{
			  dRegions=dRegionService.selectAllDRegionByFirstCode(zoneCode,classId);
			  em.setMessage("根据一级查询二级地名") ;
		  }catch (Exception e) {
				em.setMessage("根据一级查询二级地名时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", dRegions);
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据一级查询二级地名方法");
		  return map;
	  } 
	  
	  /**
	   * 根据二级查询三级地名
	   * 
	   * 截取regionId前两位进行模糊查询
	   *@author: dengliaohang
	   *@date： 日期：2017-10-25 时间：下午3:28:02
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectAllDRegionBySecondCode",method = RequestMethod.GET)
	  public Map<String, Object> selectAllDRegionBySecondCode(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据二级查询三级地名方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<DRegion> dRegions=new ArrayList<DRegion>();
		  DRegion dRegion=new DRegion();
		  String regionId=request.getParameter("regionId");
		  try{
			  dRegions=dRegionService.selectAllDRegionBySecondCode(regionId);
			  em.setMessage("根据二级查询三级地名") ;
		  }catch (Exception e) {
				em.setMessage("根据二级查询三级地名时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", dRegions);
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据二级查询三级地名方法");
		  return map;
	  } 
	  
}
