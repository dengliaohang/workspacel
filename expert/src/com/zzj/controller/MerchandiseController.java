package com.zzj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzj.entity.Merchandise;
import com.zzj.service.MerchandiseService;
import com.zzj.util.ExceptionMessage;


@Controller
@RequestMapping(value="merchandise")
public class MerchandiseController {

	
	private Logger logger = Logger.getLogger(MerchandiseController.class);
	
	
	@Autowired
	private MerchandiseService merchandiseService;
	
	/**
	 * 根据ID删除成果/需求/服务
	 *@author: dengliaohang
	 *@date： 日期：2017-10-26 时间：上午11:55:33
	 *@param request
	 *@param response
	 *@return
	 *
	 *
	 */
	@ResponseBody
	@RequestMapping(value="/deleteByPrimaryKey",method = RequestMethod.POST)
	public Map<String, Object> deleteByPrimaryKey(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据主键删除成果/需求/服务方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  
		  try{
			  	//merchandiseService.deleteByPrimaryKey(id);
				em.setMessage("根据主键删除成果/需求/服务") ;
		  }catch (Exception e) {
				em.setMessage("根据主键删除成果/需求/服务时系统发生异常") ;
				em.setCode("00000");
				logger.error(em.getMessage(), e);
		  }
		  map.put("code", em.getCode());
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据主键删除成果/需求/服务方法");
		  return map;
		
	}
	
	
	/**
	 * 添加成果/需求/服务
	 * merchandiseType 成果为0            需求为1          服务为2
	 *@author: dengliaohang
	 *@date： 日期：2017-10-26 时间：上午11:57:52
	 *@param request
	 *@param response
	 *@return
	 */
	@ResponseBody
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public Map<String, Object> insert( HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入添加成果/需求/服务方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  String department = request.getParameter("department");
		  String 
		  System.out.println(department);
		  net.sf.json.JSONObject fromObject = net.sf.json.JSONObject.fromObject(merchandise);
		  Merchandise merJs = (Merchandise) JSONObject.toBean(fromObject, Merchandise.class);
		  try{
			    //merchandiseService.insert(merJs);
				em.setMessage("添加成果/需求/服务") ;
				em.setCode("000001");
		  }catch (Exception e) {
				em.setMessage("添加成果/需求/服务时系统发生异常") ;
				em.setCode("00000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("code", em.getCode());
		  logger.info(em.getMessage()) ;
		  logger.info("结束添加成果/需求/服务方法");
		  return map;
		
	}
	
	
	
	/**
	 * 添加成果需求
	 * merchandiseType 成果为0            需求为1          服务为2
	 *@author: dengliaohang
	 *@date： 日期：2017-10-26 时间：上午11:58:21
	 *@param request
	 *@param response
	 *@return
	 */
	/*@ResponseBody
	@RequestMapping(value="/insertSelective",method = RequestMethod.POST)
	public Map<String, Object> insertSelective(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入选择性添加成果方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  try{
			    //em.setMessage("00000"+achievementService.insertSelective(record));
				em.setMessage("选择性添加成果成果") ;
		  }catch (Exception e) {
				em.setMessage("选择性添加成果时系统发生异常") ;
				em.setCode("00000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("code", em.getCode());
		  logger.info(em.getMessage()) ;
		  logger.info("结选择性添加成果方法");
		  return map;
		
	}*/
	
	/**
	 * 通过Id查询成果需求/服务
	 *@author: dengliaohang
	 *@date： 日期：2017-10-26 时间：下午1:40:39
	 *@param request
	 *@param response
	 *@return
	 */
	  @ResponseBody
	  @RequestMapping(value="/selectByPrimaryKey",method = RequestMethod.GET)
	  public Map<String, Object> selectByPrimaryKey(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入通过Id查询成果需求方法/服务");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  Merchandise merchandise=new Merchandise();
		  try{
			    //merchandise=merchandiseService.selectByPrimaryKey(id);
				em.setMessage("通过Id查询成果需求/服务") ;
		  }catch (Exception e) {
				em.setMessage("通过Id查询成果需求/服务时系统发生异常") ;
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("merchandise", merchandise);
		  logger.info(em.getMessage()) ;
		  logger.info("结束通过Id查询成果/服务需求方法");
		  return map;
	  }   
	
	  
	  /**
	   * 根据主键选择性修改成果/需求/服务
	   *@author: dengliaohang
	   *@date： 日期：2017-10-26 时间：下午1:45:34
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/updateByPrimaryKeySelective",method = RequestMethod.POST)
	  public Map<String, Object> updateByPrimaryKeySelective(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据主键选择性修改成果需求/服务方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  try{
			  	//merchandiseService.updateByPrimaryKeySelective(record);
			  	em.setCode("000001");
			    em.setMessage("根据主键选择性修改成果/服务需求") ;
		  }catch (Exception e) {
				em.setMessage("根据主键选择性修改成果需求/服务时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("code", em.getCode());
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据主键选择性修改成果/服务需求方法");
		  return map;
	  }
	  
	  

	  
	  
	  
	  
	 /**
	  * 通过Id修改成果/需求/服务
	  *@author: dengliaohang
	  *@date： 日期：2017-10-26 时间：下午2:03:48
	  *@param request
	  *@param response
	  *@return
	  */
	/*  @ResponseBody
	  @RequestMapping(value="/updateByPrimaryKey",method = RequestMethod.POST)
	  public Map<String, Object> updateByPrimaryKey(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入通过Id修改成果需求/服务方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  
		  try{
			  	//merchandiseService.updateByPrimaryKey(record);
			  	em.setCode("000001");
				em.setMessage("通过Id修改成果需求/服务") ;
		  }catch (Exception e) {
				em.setMessage("通过Id修改成果需求/服务时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("code", em.getCode());
		  logger.info(em.getMessage()) ;
		  logger.info("结束通过Id修改成果需求/服务方法");
		  return map;
	  } */
	  
	  /**
	   * 根据职业查询 成果/需求/服务
	   * merchandiseType 成果为0            需求为1          服务为2
	   *@author: dengliaohang
	   *@date： 日期：2017-10-25 时间：下午2:13:24
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectMerchandiseByPTitle",method = RequestMethod.GET)
	  public Map<String, Object> selectMerchandiseByPTitle(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据职业查询 成果/需求/服务方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<Merchandise> merchandises=new ArrayList<Merchandise>();
		  
		  try{
			  	//merchandises=merchandiseService.selectMerchandiseByPTitle(cp, ls, pTitleId, merchandiseType);
				em.setMessage("根据职业查询 成果/需求/服务") ;
		  }catch (Exception e) {
				em.setMessage("根据职业查询 成果/需求/服务时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", merchandises);
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据职业查询 成果/需求/服务方法");
		  return map;
	  } 
	  
	  
	  /**
	   * 根据地区查询成果/需求/服务 
	   * merchandiseType 成果为0            需求为1          服务为2
	   *@author: dengliaohang
	   *@date： 日期：2017-10-26 时间：下午2:11:01
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectMerchandiseByDRegion",method = RequestMethod.GET)
	  public Map<String, Object> selectMerchandiseByDRegion(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据地区查询成果/需求/服务 方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<Merchandise> merchandises=new ArrayList<Merchandise>();
		  
		  try{
			  	//merchandises=merchandiseService.selectMerchandiseByDRegion(record);
				em.setMessage("根据地区查询成果/需求/服务 ") ;
		  }catch (Exception e) {
				em.setMessage("根据地区查询成果/需求/服务 时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", merchandises);
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据地区查询成果/需求/服务方法");
		  return map;
	  } 
	  
	  
	  /**
	   * merchandiseType 成果为0            需求为1          服务为2
	   * 根据类型查询成果/需求/服务
	   *@author: dengliaohang
	   *@date： 日期：2017-10-26 时间：下午2:12:55
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectMerchandiseByType",method = RequestMethod.GET)
	  public Map<String, Object> selectMerchandiseByType(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入根据类型查询成果/需求/服务 方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<Merchandise> merchandises=new ArrayList<Merchandise>();
		  
		  try{
			  	//merchandises=merchandiseService.selectMerchandiseByDRegion(record);
				em.setMessage("根据类型查成果/需求/服务 ") ;
		  }catch (Exception e) {
				em.setMessage("根据类型查询成果/需求/服务时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", merchandises);
		  logger.info(em.getMessage()) ;
		  logger.info("结束根据类型查询成果/需求/服务方法");
		  return map;
	  } 
	  
	  
	  /**
	   * merchandiseType 成果为0            需求为1          服务为2
	   * 搜索栏模糊查询 成果/需求/服务
	   *@author: dengliaohang
	   *@date： 日期：2017-10-27 时间：上午11:17:41
	   *@param request
	   *@param response
	   *@return
	   */
	  @ResponseBody
	  @RequestMapping(value="/selectMerchandiseByDescription",method = RequestMethod.GET)
	  public Map<String, Object> selectMerchandiseByDescription(HttpServletRequest request, HttpServletResponse response){
		  logger.info("进入搜索栏模糊查询 成果/需求/服务 方法");
		  Map<String, Object> map = new HashMap<String, Object>();
		  ExceptionMessage em = new ExceptionMessage() ;
		  List<Merchandise> merchandises=new ArrayList<Merchandise>();
		  
		  try{
			  	//merchandises= merchandiseService.selectMerchandiseByDescription(cp, ls, merchandiseType, description);
				em.setMessage("搜索栏模糊查询 成果/需求/服务 ") ;
		  }catch (Exception e) {
				em.setMessage("搜索栏模糊查询 成果/需求/服务时系统发生异常") ;
				em.setCode("000000");
				logger.error(em.getMessage(), e) ;
		  }
		  map.put("list", merchandises);
		  logger.info(em.getMessage()) ;
		  logger.info("结束搜索栏模糊查询 成果/需求/服务方法");
		  return map;
	  } 
	
}
