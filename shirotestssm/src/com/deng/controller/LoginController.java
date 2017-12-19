package com.deng.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deng.entity.User;
import com.deng.service.userService;

/****
 * 用户登录Controller
 * 
 * @author deng
 * 
 */
@Controller
public class LoginController {
	
	@Autowired
	private userService ser;

	/***
	 * 实现用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Login(String username, String password,HttpServletRequest req) {
		  try {
	        	UsernamePasswordToken token = new UsernamePasswordToken(username,password);
	    		Subject subject = SecurityUtils.getSubject();
	    		subject.login(token);
	        } catch (UnknownAccountException e) {
	            e.printStackTrace();
	         req.getSession().setAttribute("errorMessage", "用户名或密码错误");
	            return "login";
	        } catch (AuthenticationException e) {
	            e.printStackTrace();
	            req.getSession().setAttribute("errorMessage", "用户名或密码错误");
	            return "login";
	        }
		  
	        // 登录后存放进shiro token
	        return "home";
	}
	
}
