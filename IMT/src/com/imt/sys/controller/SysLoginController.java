package com.imt.sys.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imt.pat.entity.Country;
import com.imt.pat.service.PatientService;
import com.imt.sys.entity.SysUserEntity;
import com.imt.sys.service.SysUserService;
import com.imt.sys.util.VerifyCodeUtils;


@Controller
public class SysLoginController {
	/* 
	 * 登陆相关
	 * */
	@Autowired
	private PatientService patientService;
	@Autowired
	private HttpServletRequest request;
	
	private SysUserEntity sysUserEntity=new SysUserEntity();
	@Autowired
	private SysUserService sysUserService;
/*	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(
			@RequestParam("uname") String username,  
            @RequestParam("pword") String password,
            @RequestParam("privilege") String privilege){
		System.out.println("this================================CONTROLLER");
		System.out.println(username);
		int state=1;
		if(privilege=="管理员"){
			 state=0;
		}
		sysUserEntity.setSys_user_name(username);
		sysUserEntity.setSys_user_password(password);
		sysUserEntity.setSys_user_state(state);
		SysUserEntity querySysUser = sysUserService.querySysUser(sysUserEntity);
		System.out.println(querySysUser);
		if(querySysUser!=null){
			request.getSession().setAttribute("sysuser", querySysUser.getSys_user_name());
			return "manage";
		}else{
			return "error";
		}
	}*/
	
	
	//动态ajax登陸
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		String code=request.getParameter("code");
		/*String privilege=request.getParameter("privilege");
		System.out.println("ppp==========="+privilege);
		int state=1;
		if(privilege=="sysuser"){
			 state=0;
		}*/
		String codee=(String) request.getSession().getAttribute("verCode");
		response.setCharacterEncoding("utf-8");
		System.out.println("code==="+code+"codee===="+codee);
		if(!(code.toLowerCase().equals(codee))){
			response.getWriter().write("codeerror");
			return;
		}
		sysUserEntity.setSys_user_name(username);
		sysUserEntity.setSys_user_password(password);
		SysUserEntity querySysUser = sysUserService.querySysUser(sysUserEntity);
		
		if((querySysUser!=null)&&querySysUser.getSys_user_isDel()==1&&querySysUser.getSys_user_able()==1){
			System.out.println("is++++++++++++++++++++++true");
			request.getSession().setAttribute("currsysuser", querySysUser.getSys_user_Cname());
			request.getSession().setAttribute("currstate", querySysUser.getSys_user_state());
			request.getSession().setAttribute("currSysUserId", querySysUser.getSys_user_id());
			request.getSession().setAttribute("currJobId", querySysUser.getJob_id());
			//设置session过期时间
			request.getSession().setMaxInactiveInterval(60*60*6);
			List<Country> queryAllCountry = patientService.queryAllCountry();
			request.getSession().setAttribute("allCoun", queryAllCountry);
			response.getWriter().write("success");
		}else if((querySysUser!=null)&&querySysUser.getSys_user_isDel()==1&&querySysUser.getSys_user_able()==0){
			response.getWriter().write("disable");
			System.out.println("is++++++++++++++++++++++false");
		}else{
			response.getWriter().write("errorno");
			System.out.println("is++++++++++++++++++++++false");
		}
	}
	//退出登录
	@RequestMapping(value="/cancelUser",method=RequestMethod.POST)
	public void cancelUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//String userId=request.getParameter("userId");
		//int uId=Integer.parseInt(userId);
		request.getSession().removeAttribute("currsysuser");
		request.getSession().removeAttribute("currstate");
		request.getSession().removeAttribute("currSysUserId");
		request.getSession().removeAttribute("currJobId");
		request.getSession().removeAttribute("allDepl");
		response.setCharacterEncoding("utf-8");
		System.out.println("清空  session~~~~~");
		response.getWriter().write("success");
	}
	//验证码
	@RequestMapping(value="/AuthImage")
	public void AuthImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setHeader( "Pragma", "no-cache" );
		response.addHeader( "Cache-Control", "must-revalidate" );
		response.addHeader( "Cache-Control", "no-cache" );
		response.addHeader( "Cache-Control", "no-store" );
		response.setDateHeader("Expires", 0); 
        response.setContentType("image/jpeg"); 
        System.out.println("tupian++++");
        //生成随机字串 
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4); 
        System.out.println("图片验证码====="+verifyCode);
        //存入会话session 
        HttpSession session = request.getSession(true); 
        //删除以前的
        session.removeAttribute("verCode");
        session.setAttribute("verCode", verifyCode.toLowerCase()); 
        //生成图片 
        int w = 100, h = 30; 
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode); 
        
    } 
	//刷新页面验证码
	@RequestMapping(value="/AuthImageref")
	public void AuthImageref(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		  HttpSession session = request.getSession(true);
		  String a= (String)session.getAttribute("verCode");
		  System.out.println("vode=="+a);
		  session.setAttribute("verCodee",a);
		  response.setCharacterEncoding("utf-8");
		  response.getWriter().write(a);
    } 

}
