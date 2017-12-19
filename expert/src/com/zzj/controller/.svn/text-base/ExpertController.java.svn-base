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

import com.zzj.entity.TPerson;
import com.zzj.service.TPersonService;
import com.zzj.util.ExceptionMessage;

@Controller
@RequestMapping(value="expert")
public class ExpertController {
	private Logger logger = Logger.getLogger(ExpertController.class);
	//注入Service
	@Autowired
	private TPersonService personService;
	/**
	 * 查询全部的专家信息
	 * @author wangyadi
	 * 
	 */
	@ResponseBody
	@RequestMapping(value="all", method = RequestMethod.GET)
	public Map<String, Object> all(HttpServletRequest request, HttpServletResponse response){
		logger.info("进入查询全部专家方法");
		Map<String, Object> map = new HashMap<String, Object>();
		ExceptionMessage em = new ExceptionMessage() ;
		
		try{
			map = personService.queryPersonsAll(1, 10, 1);
			em.setMessage("查询全部专家") ;
		}catch (Exception e) {
			em.setMessage("查询全部专家时系统发生异常") ;
			logger.error(em.getMessage(), e) ;
		}
		
		//map.put("list", list);
		logger.info(em.getMessage()) ;
		logger.info("结束查询全部专家方法");
		return map;
	}
}
