package com.imt.pat.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imt.pat.dao.PatientDao;
import com.imt.pat.entity.DateCalendar;
import com.imt.pat.entity.Net;
import com.imt.pat.entity.PageLimit;
import com.imt.pat.entity.ResCount;
import com.imt.pat.entity.patientEntity;
import com.imt.pat.service.PatientService;
import com.imt.sys.entity.DepartmentEntity;
import com.imt.sys.entity.PageLimitAll;
import com.imt.sys.entity.SysUserEntity;
import com.imt.sys.service.SysUserService;
import com.imt.sys.util.uploadText;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
public class PatientController {
	@Autowired
	private SysUserService sysUserService;
	private SysUserEntity sysUserEntity=new SysUserEntity();
	@Autowired
	private PatientService patientService;
	private PageLimitAll pageLimitAll=new PageLimitAll();
	private patientEntity patientEntity=new patientEntity();
	private PageLimit pageLimit=new PageLimit();
	private DateCalendar dateCalendar =new DateCalendar();
	
	//添加患者信息
	@RequestMapping(value="/Template/addPatient",method=RequestMethod.POST)
	public void addPatient(HttpServletRequest request,HttpServletResponse response) throws IOException, ParseException{
		System.out.println("进来了  ADDpatient====");
		String pat_name=request.getParameter("pat_name");
		String pat_age=request.getParameter("pat_age");
		String pat_sex=request.getParameter("pat_sex");
		String con_name=request.getParameter("con_name");
		String con_country=request.getParameter("con_country");
		String pat_sysptom=request.getParameter("pat_sysptom");
		String pat_entity=request.getParameter("pat_entity");
		String report=request.getParameter("report");
		String passport=request.getParameter("passport");
		String remark=request.getParameter("remark");
		String pat_address=request.getParameter("pat_address");
		String pat_con_rel=request.getParameter("pat_con_rel");
		String con_address=request.getParameter("con_address");
		String con_email=request.getParameter("con_email");
		String critical=request.getParameter("critical");
		String resource=request.getParameter("resource");
		String hospital=request.getParameter("hospital");
		String rep_time=request.getParameter("rep_time");
		String con_phone=request.getParameter("con_phone");
		String luru=request.getParameter("luru");
		String zhiban=request.getParameter("zhiban");
		String net=request.getParameter("net");
		String pat_intion_lev=request.getParameter("pat_intion_lev");
		String uetext=request.getParameter("uetext");
		System.out.println("text文本框的内容====="+uetext);
		int repId=Integer.parseInt(luru);
		/*
		 * 将文本框的内容保存到本地F：//text
		 * */
		UUID uuid=UUID.randomUUID();
		System.out.println("uuid======"+uuid);
		uploadText up=new uploadText();
		up.saveAsFileWriter(uetext, uuid);
		String ue="F:/text/"+uuid+".txt";
		patientEntity.setUe(ue);
		int ipat_age=0;
		if(!("".equals(pat_age))){
			ipat_age=Integer.parseInt(pat_age);
		}
		
		int ipat_intion_lev=Integer.parseInt(pat_intion_lev);
		String icon_phone="0";
		if(con_phone!=""){
			icon_phone=con_phone;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(new Date());
		Date date=sdf.parse(format);
		patientEntity.setNet(Integer.parseInt(net));
		patientEntity.setReport_user_id(repId);
		patientEntity.setConsultation_address(con_address);
		patientEntity.setConsultation_email(con_email);
		patientEntity.setCritical_state(critical);
		patientEntity.setHospital_state(hospital);
		patientEntity.setPatient_address(pat_address);
		patientEntity.setPatient_age(ipat_age);
		patientEntity.setPatient_consultation_country(Integer.parseInt(con_country));
		patientEntity.setPatient_consultation_name(con_name);
		patientEntity.setPatient_consultation_phone(icon_phone);
		patientEntity.setPatient_consultation_relation(pat_con_rel);
		patientEntity.setPatient_entity(Integer.parseInt(pat_entity));
		patientEntity.setPatient_intention_level(ipat_intion_lev);
		patientEntity.setPatient_name(pat_name);
		patientEntity.setPatient_passport_state(passport);
		patientEntity.setPatient_report_state(report);
		patientEntity.setPatient_sex(pat_sex);
		patientEntity.setPatient_sysptom(pat_sysptom);
		patientEntity.setRemark(remark);
		patientEntity.setReport_date(date);
		patientEntity.setResource_state(resource);
		patientEntity.setSys_user_id(1);
		patientEntity.setPatient_id(0);
		patientEntity.setPatient_isDel(0);
		patientEntity.setRep_datel(null);
		patientEntity.setUpdate_date(null);
		int addPatient = patientService.addPatient(patientEntity);
		response.setCharacterEncoding("utf-8");
		if(addPatient>0){
			response.getWriter().write("success");
		}else{
			response.getWriter().write("error");
		}
	}
	//转资源
	@RequestMapping(value="/Template/refPatient",method=RequestMethod.POST)
	public void refPatient(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String patId=req.getParameter("patId");
		String[] patIds = patId.split(",");
		String userid = req.getParameter("userId");
		for(int i=0;i<patIds.length;i++){
			int a=Integer.parseInt(patIds[i]);
			patientService.updatePatientToUser(a, Integer.parseInt(userid));
		}
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write("success");
	}
	/*//通过国家查询患者
	@RequestMapping(value="/Template/queryPatientByCoun",method=RequestMethod.GET)
	public String queryPatientByCoun(HttpServletRequest req,HttpServletResponse resp,Model model){
		String id = req.getParameter("id");
		Integer uId=(Integer)req.getSession().getAttribute("currSysUserId"); 
		pageLimit.setSys_user_id(uId);
		pageLimit.setPatient_consultation_country(Integer.parseInt(id));
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		
		return null;
		
	}*/
	//查询所有的患者属于谁的
	@RequestMapping(value="/Template/queryAllPatient",method=RequestMethod.GET)
	public String queryAllPatient(HttpServletRequest request,HttpServletResponse response,Model model) throws IOException{
		System.out.println("1111111111");
		Integer curr = (Integer) request.getSession().getAttribute("currstate");
		String flag=request.getParameter("patient_isDel");
		System.out.println("flag====="+flag);
		if("3".equals(flag)){
			String id=request.getParameter("id");
			System.out.println("id=========="+id);
			String coun = request.getParameter("coun");
			List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
			request.getSession().setAttribute("allDepl", queryAllDep);
			int jobId=(Integer) request.getSession().getAttribute("currJobId");
			//String patient_isDel=request.getParameter("patient_isDel");
			//int isDel=Integer.parseInt(patient_isDel);
			patientEntity.setPatient_isDel(0);
		//	int patient_isDels=Integer.parseInt(patient_isDel);
			String pindex=request.getParameter("pindex");
			Integer uId=(Integer)request.getSession().getAttribute("currSysUserId");
			int ipindex=Integer.parseInt(pindex);
			int offset=(ipindex-1)*10;
			int startlimit=10;
			pageLimit.setOffset(offset);
			pageLimit.setStartlimit(startlimit);
			pageLimit.setPatient_isDel(0);
			List<patientEntity> queryAllPatient =new ArrayList<patientEntity>();
			int queryAllPatientCount=0;
			pageLimit.setPatient_consultation_country(Integer.parseInt(id));
			pageLimit.setPatient_consultation_country(Integer.parseInt(id));
			if(jobId==1){
				pageLimit.setSys_user_id(uId);
				queryAllPatient= patientService.queryPatientByCoun(pageLimit);
				//查询所有患者总数
				queryAllPatientCount=patientService.queryPatientByCounl(pageLimit);
			}else{
				pageLimit.setReport_user_id(uId);
				queryAllPatient=patientService.queryPatientByCounK(pageLimit);
				queryAllPatientCount=patientService.queryPatientByCounKl(pageLimit);
			}
			
			response.setCharacterEncoding("utf-8");
			System.out.println("size=="+queryAllPatient.size());
			List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
			model.addAttribute("allUser", queryAllEmp);
			
			int currpage=queryAllPatientCount/startlimit;
			int spagesize=queryAllPatientCount%10;
			int nowpage=0;
			if(spagesize==0){
					nowpage=currpage;
			}else{
				nowpage=currpage+1;
			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			for (patientEntity p : queryAllPatient) {
				String times= df.format(p.getReport_date());
				/*Date dates=df.parse(times);
				p.setReport_date(dates);
				System.out.println("times==="+times+"dates==="+dates);*/
				p.setRep_date(times);
			}
			
			//设置分页信息
			pageLimitAll.setPindex(ipindex);
			pageLimitAll.setPcount(queryAllPatientCount);
			pageLimitAll.setPtotalpages(nowpage);
			pageLimitAll.setPsize(startlimit);
			request.setAttribute("page", pageLimitAll); 
			//model.addAttribute("patientList", queryAllPatientCount);
			System.out.println("count========="+queryAllPatientCount);
			System.out.println("list=="+queryAllPatient.size());
			for(patientEntity p:queryAllPatient){
				p.setCountry(patientService.queryCountryById(p.getPatient_consultation_country()));
				sysUserEntity.setSys_user_id(p.getReport_user_id());
				SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
				p.setReportName(querySysUserById.getSys_user_Cname());
			}
				request.setAttribute("counPat", queryAllPatient);
		}else if("0".equals(flag)){
		String coun = request.getParameter("coun");
		List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
		request.getSession().setAttribute("allDepl", queryAllDep);
		int jobId=(Integer) request.getSession().getAttribute("currJobId");
		//String patient_isDel=request.getParameter("patient_isDel");
		//int isDel=Integer.parseInt(patient_isDel);
		patientEntity.setPatient_isDel(0);
	//	int patient_isDels=Integer.parseInt(patient_isDel);
		String pindex=request.getParameter("pindex");
		Integer uId=(Integer)request.getSession().getAttribute("currSysUserId");
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		pageLimit.setPatient_isDel(0);
		List<patientEntity> queryAllPatient =new ArrayList<patientEntity>();
		int queryAllPatientCount=0;
		if(jobId==1){
			pageLimit.setSys_user_id(uId);
			queryAllPatient= patientService.queryAllPatient(pageLimit);
			//查询所有患者总数
			patientEntity.setSys_user_id(uId);
			queryAllPatientCount=patientService.queryAllPatientCount(patientEntity);
		}else{
			pageLimit.setReport_user_id(uId);
			queryAllPatient=patientService.queryAllPatientByk(pageLimit);
			patientEntity.setReport_user_id(uId);
			queryAllPatientCount=patientService.queryAllPatientCountByk(patientEntity);
		}
		
		response.setCharacterEncoding("utf-8");
		System.out.println("size=="+queryAllPatient.size());
		List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
		model.addAttribute("allUser", queryAllEmp);
		
		int currpage=queryAllPatientCount/startlimit;
		int spagesize=queryAllPatientCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		for (patientEntity p : queryAllPatient) {
			String times= df.format(p.getReport_date());
			/*Date dates=df.parse(times);
			p.setReport_date(dates);
			System.out.println("times==="+times+"dates==="+dates);*/
			p.setRep_date(times);
		}
		
		//设置分页信息
		pageLimitAll.setPindex(ipindex);
		pageLimitAll.setPcount(queryAllPatientCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		request.setAttribute("page", pageLimitAll); 
		//model.addAttribute("patientList", queryAllPatientCount);
		System.out.println("count========="+queryAllPatientCount);
		System.out.println("list=="+queryAllPatient.size());
		for(patientEntity p:queryAllPatient){
			p.setCountry(patientService.queryCountryById(p.getPatient_consultation_country()));
			sysUserEntity.setSys_user_id(p.getReport_user_id());
			SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
			p.setReportName(querySysUserById.getSys_user_Cname());
		}
			request.setAttribute("patientList", queryAllPatient);
		}else if("1".equals(flag)){
			//电话模糊查询
			String phone = request.getParameter("name");
			System.out.println("phone======"+phone);
			List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
			request.getSession().setAttribute("allDepl", queryAllDep);
			int jobId=(Integer) request.getSession().getAttribute("currJobId");
			//String patient_isDel=request.getParameter("patient_isDel");
			//int isDel=Integer.parseInt(patient_isDel);
			patientEntity.setPatient_isDel(0);
		//	int patient_isDels=Integer.parseInt(patient_isDel);
			String pindex=request.getParameter("pindex");
			Integer uId=(Integer)request.getSession().getAttribute("currSysUserId");
			System.out.println("uid====="+uId);
			int ipindex=Integer.parseInt(pindex);
			int offset=(ipindex-1)*10;
			int startlimit=10;
			pageLimit.setOffset(offset);
			pageLimit.setStartlimit(startlimit);
			pageLimit.setPatient_isDel(0);
			pageLimit.setPhone(phone);
			List<patientEntity> queryAllPatient =new ArrayList<patientEntity>();
			int queryAllPatientCount=0;
			if(jobId==1){
				System.out.println("this is  phone  query by  yisheng ");
				pageLimit.setSys_user_id(uId);
				queryAllPatient= patientService.queryPatientByPhone(pageLimit);
				//查询所有患者总数
				queryAllPatientCount=patientService. queryPatientByPhonel(pageLimit);
			}else{
				System.out.println("this is  phone  query by  kfu ");
				pageLimit.setReport_user_id(uId);
				queryAllPatient=patientService.queryPatientByPhone(pageLimit);
				queryAllPatientCount=patientService.queryPatientByPhonel(pageLimit);
			}
			
			response.setCharacterEncoding("utf-8");
			System.out.println("size=="+queryAllPatient.size());
			List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
			model.addAttribute("allUser", queryAllEmp);
			
			int currpage=queryAllPatientCount/startlimit;
			int spagesize=queryAllPatientCount%10;
			int nowpage=0;
			if(spagesize==0){
					nowpage=currpage;
			}else{
				nowpage=currpage+1;
			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			for (patientEntity p : queryAllPatient) {
				String times= df.format(p.getReport_date());
				/*Date dates=df.parse(times);
				p.setReport_date(dates);
				System.out.println("times==="+times+"dates==="+dates);*/
				p.setRep_date(times);
			}
			
			//设置分页信息
			pageLimitAll.setPindex(ipindex);
			pageLimitAll.setPcount(queryAllPatientCount);
			pageLimitAll.setPtotalpages(nowpage);
			pageLimitAll.setPsize(startlimit);
			request.setAttribute("page", pageLimitAll); 
			//model.addAttribute("patientList", queryAllPatientCount);
			System.out.println("count========="+queryAllPatientCount);
			System.out.println("list=="+queryAllPatient.size());
			for(patientEntity p:queryAllPatient){
				p.setCountry(patientService.queryCountryById(p.getPatient_consultation_country()));
				sysUserEntity.setSys_user_id(p.getReport_user_id());
				SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
				p.setReportName(querySysUserById.getSys_user_Cname());
			}
				request.setAttribute("patByphone", queryAllPatient);
		}else if("2".equals(flag)){
			//邮箱模糊查询
			String email = request.getParameter("name");
			List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
			request.getSession().setAttribute("allDepl", queryAllDep);
			int jobId=(Integer) request.getSession().getAttribute("currJobId");
			//String patient_isDel=request.getParameter("patient_isDel");
			//int isDel=Integer.parseInt(patient_isDel);
			patientEntity.setPatient_isDel(0);
		//	int patient_isDels=Integer.parseInt(patient_isDel);
			String pindex=request.getParameter("pindex");
			Integer uId=(Integer)request.getSession().getAttribute("currSysUserId");
			int ipindex=Integer.parseInt(pindex);
			int offset=(ipindex-1)*10;
			int startlimit=10;
			pageLimit.setOffset(offset);
			pageLimit.setStartlimit(startlimit);
			pageLimit.setPatient_isDel(0);
			pageLimit.setEmail(email);
			List<patientEntity> queryAllPatient =new ArrayList<patientEntity>();
			int queryAllPatientCount=0;
			if(jobId==1){
				pageLimit.setSys_user_id(uId);
				queryAllPatient= patientService.queryPatientByEmail(pageLimit);
				//查询所有患者总数
				queryAllPatientCount=patientService. queryPatientByEmaill(pageLimit);
			}else{
				pageLimit.setReport_user_id(uId);
				queryAllPatient= patientService.queryPatientByEmail(pageLimit);
				queryAllPatientCount=patientService. queryPatientByEmaill(pageLimit);
			}
			
			response.setCharacterEncoding("utf-8");
			System.out.println("size=="+queryAllPatient.size());
			List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
			model.addAttribute("allUser", queryAllEmp);
			
			int currpage=queryAllPatientCount/startlimit;
			int spagesize=queryAllPatientCount%10;
			int nowpage=0;
			if(spagesize==0){
					nowpage=currpage;
			}else{
				nowpage=currpage+1;
			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			for (patientEntity p : queryAllPatient) {
				String times= df.format(p.getReport_date());
				/*Date dates=df.parse(times);
				p.setReport_date(dates);
				System.out.println("times==="+times+"dates==="+dates);*/
				p.setRep_date(times);
			}
			
			//设置分页信息
			pageLimitAll.setPindex(ipindex);
			pageLimitAll.setPcount(queryAllPatientCount);
			pageLimitAll.setPtotalpages(nowpage);
			pageLimitAll.setPsize(startlimit);
			request.setAttribute("page", pageLimitAll); 
			//model.addAttribute("patientList", queryAllPatientCount);
			System.out.println("count========="+queryAllPatientCount);
			System.out.println("list=="+queryAllPatient.size());
			for(patientEntity p:queryAllPatient){
				p.setCountry(patientService.queryCountryById(p.getPatient_consultation_country()));
				sysUserEntity.setSys_user_id(p.getReport_user_id());
				SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
				p.setReportName(querySysUserById.getSys_user_Cname());
			}
				request.setAttribute("patByemail", queryAllPatient);
		}
		return "find-1";
		
	}
	//查询所有患者，超级管理员查询的
	@RequestMapping(value="/queryAllPatientC")
	public String queryAllPatientC(HttpServletRequest request,HttpServletResponse response,Model model){
		String pindex=request.getParameter("pindex");
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		pageLimit.setPatient_isDel(0);
		patientEntity.setPatient_isDel(0);
		List<patientEntity> queryAllPatient= patientService.queryAllPatientC(pageLimit);
		//查询所有患者总数
		int queryAllPatientCount=patientService. queryAllPatientCountC(patientEntity);
		response.setCharacterEncoding("utf-8");
		int currpage=queryAllPatientCount/startlimit;
		int spagesize=queryAllPatientCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		for (patientEntity p : queryAllPatient) {
			String times= df.format(p.getReport_date());
			p.setRep_date(times);
		}
		
		//设置分页信息
		pageLimitAll.setPindex(ipindex);
		pageLimitAll.setPcount(queryAllPatientCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		request.setAttribute("page", pageLimitAll); 
		for(patientEntity p:queryAllPatient){
			p.setCountry(patientService.queryCountryById(p.getPatient_consultation_country()));
			sysUserEntity.setSys_user_id(p.getReport_user_id());
			SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
			p.setReportName(querySysUserById.getSys_user_Cname());
		}
			request.setAttribute("patByemail", queryAllPatient);
		return "find-2";
	}
	//新资源30天内 新资源
	@RequestMapping(value="/Template/querynewResource",method=RequestMethod.GET)
	public String querynewResource(HttpServletRequest req,
			@RequestParam("pindex") int pindex,
			@RequestParam("pcount") int pcount,
			Model model) throws ParseException{
		
		int offset=(pindex-1)*10;
		int startlimit=10;
		System.out.println("pindex==="+pindex);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");//设置日期格式
		String currdate = df.format(new Date());
		System.out.println( "当前时间"+currdate);// new Date()为获取当前系统时间
		Date dateAdd = dateCalendar.dateAdd(-45);
		String format = df.format(dateAdd);
		Integer uId=(Integer)req.getSession().getAttribute("currSysUserId");
		Integer currstate=(Integer) req.getSession().getAttribute("currstate");
		if(currstate!=2){
			pageLimit.setSys_user_id(uId);
		}
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		pageLimit.setLdate(format);
		pageLimit.setCurrdate(currdate);
		List<com.imt.pat.entity.patientEntity> queryNewPatient = patientService.queryNewPatient( pageLimit);
		for (patientEntity p : queryNewPatient) {
			String times= df.format(p.getReport_date());
			/*Date dates=df.parse(times);
			p.setReport_date(dates);
			System.out.println("times==="+times+"dates==="+dates);*/
			p.setRep_date(times);
		}
		
		int queryNewPatientCount = patientService.queryNewPatientCount(pageLimit);
		int currpage=queryNewPatientCount/startlimit;
		int spagesize=queryNewPatientCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(pindex);
		pageLimitAll.setPcount( queryNewPatientCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		model.addAttribute("newResourceList", queryNewPatient);
		System.out.println("count========="+queryNewPatientCount);
		System.out.println("list=="+queryNewPatient.size());
		//req.getSession().setAttribute("newResourceList", queryNewPatient);
		return "querynewResource";
	}
	
	//过期资源 30天外  过期资源
	@RequestMapping(value="/Template/queryOutPatient",method=RequestMethod.GET)
	public String queryOutPatient(HttpServletRequest req,
			@RequestParam("pindex") int pindex,
			@RequestParam("pcount") int pcount,
			Model model){
		int offset=(pindex-1)*10;
		int startlimit=10;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String currdate = df.format(new Date());
		Date dateAdd = dateCalendar.dateAdd(-45);
		String format = df.format(dateAdd);
		String lldate="1901-01-01";
		String nndate="2200-01-01";
		pageLimit.setLdate(format);
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		pageLimit.setNdate(lldate);
		Integer uId=(Integer)req.getSession().getAttribute("currSysUserId");
		Integer currstate=(Integer) req.getSession().getAttribute("currstate");
		if(currstate!=2){
			pageLimit.setSys_user_id(uId);
		}
		List<com.imt.pat.entity.patientEntity> queryOutPatient = patientService.queryOutPatient(pageLimit);
		for (patientEntity p : queryOutPatient) {
			String times= df.format(p.getReport_date());
			/*Date dates=df.parse(times);
			p.setReport_date(dates);
			System.out.println("times==="+times+"dates==="+dates);*/
			p.setRep_date(times);
		}
		int queryOutPatientCount = patientService.queryOutPatientCount(pageLimit);
		int currpage=queryOutPatientCount/startlimit;
		int spagesize=queryOutPatientCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(pindex);
		pageLimitAll.setPcount( queryOutPatientCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		model.addAttribute("queryOutPatientList", queryOutPatient);
		System.out.println("list=="+queryOutPatient.size());
		return "queryOutPatient";
		
	}
	
	//无效资源 resource_state  ==no   无效
	@RequestMapping(value="/Template/queryInvalidResource",method=RequestMethod.GET)
	public String queryInvalidResource(HttpServletRequest req,
			@RequestParam("pindex") int pindex,
			@RequestParam("pcount") int pcount,
			Model model){
		System.out.println("进来了无效资源查询");
		int offset=(pindex-1)*10;
		int startlimit=10;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		pageLimit.setPatient_isDel(0);
		Integer uId=(Integer)req.getSession().getAttribute("currSysUserId");
		Integer currstate=(Integer) req.getSession().getAttribute("currstate");
		if(currstate!=2){
			pageLimit.setSys_user_id(uId);
		}
		List<com.imt.pat.entity.patientEntity> queryInvalidResource = patientService.queryInvalidResource(pageLimit);
		for (patientEntity p : queryInvalidResource) {
			String times= df.format(p.getReport_date());
			/*Date dates=df.parse(times);
			p.setReport_date(dates);
			System.out.println("times==="+times+"dates==="+dates);*/
			p.setRep_date(times);
		}
		System.out.println("limit====="+offset+startlimit);
		int queryInvalidResourceCount = patientService.queryInvalidResourceCount(pageLimit);
		int currpage=queryInvalidResourceCount/startlimit;
		int spagesize=queryInvalidResourceCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		System.out.println("FENYE===="+pindex+queryInvalidResourceCount+nowpage+startlimit);
		//设置分页信息
		pageLimitAll.setPindex(pindex);
		pageLimitAll.setPcount(queryInvalidResourceCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		System.out.println(queryInvalidResource.size());
		model.addAttribute("queryInvalidResource", queryInvalidResource);
		return "invalidResource";
	}
	
	
	//所有患者 删除
	@RequestMapping(value="/Template/deletePatient",method=RequestMethod.POST)
	public void deletePatient(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String ids = req.getParameter("ids");
		System.out.println("ids==============="+ids);
		String[] sids = ids.split(",");
		System.out.println(sids[0]);
		int[]  iids=new int[10];
		for(int i=0;i<sids.length;i++){
			System.out.println(sids[i]);
			int a=Integer.parseInt(sids[i]);
			iids[i]=a;
		}
		
		int updatePat = patientService.updatePatient(iids);
		System.out.println("刪除了=========="+updatePat);
		resp.setCharacterEncoding("utf-8");
		if(updatePat>0){
			resp.getWriter().write("success");
		}else{
			resp.getWriter().write("error");
		}
	}
	//资源回收站
		@RequestMapping(value="/Template/deleteResource",method=RequestMethod.GET)
		public String deleteResource(HttpServletRequest request,
				HttpServletResponse response,
				@RequestParam("pindex") int pindex,
				@RequestParam("pcount") int pcount,
				Model model){
			int isDel=1;
			int offset=(pindex-1)*10;
			int startlimit=10;
			patientEntity.setPatient_isDel(isDel);
			pageLimit.setOffset(offset);
			pageLimit.setStartlimit(startlimit);
			pageLimit.setPatient_isDel(isDel);
			Integer uId=(Integer)request.getSession().getAttribute("currSysUserId");
			Integer currstate=(Integer) request.getSession().getAttribute("currstate");
			if(currstate!=2){
				pageLimit.setSys_user_id(uId);
				patientEntity.setSys_user_id(uId);
			}
			List<patientEntity> queryAllPatient = patientService.queryAllPatient(pageLimit);
			response.setCharacterEncoding("utf-8");
			System.out.println("size=="+queryAllPatient.size());
			
			//查询所有患者总数
			int queryAllPatientCount=patientService.queryAllPatientCount(patientEntity);
			int currpage=queryAllPatientCount/startlimit;
			int spagesize=queryAllPatientCount%10;
			int nowpage=0;
			if(spagesize==0){
					nowpage=currpage;
			}else{
				nowpage=currpage+1;
			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			for (patientEntity p : queryAllPatient) {
				String times= df.format(p.getReport_date());
				/*Date dates=df.parse(times);
				p.setReport_date(dates);
				System.out.println("times==="+times+"dates==="+dates);*/
				p.setRep_date(times);
			}
			
			//设置分页信息
			pageLimitAll.setPindex(pindex);
			pageLimitAll.setPcount(queryAllPatientCount);
			pageLimitAll.setPtotalpages(nowpage);
			pageLimitAll.setPsize(startlimit);
			request.setAttribute("page", pageLimitAll); 
			//model.addAttribute("patientList", queryAllPatientCount);
			System.out.println("count========="+queryAllPatientCount);
			System.out.println("list=="+queryAllPatient.size());
			request.setAttribute("patientList", queryAllPatient);
			return "deleteResource";
		}
	//恢复删除的患者记录
		@RequestMapping(value="/Template/recoveryPatient",method=RequestMethod.POST)
		public void recoveryPatient(HttpServletRequest request,HttpServletResponse response) throws IOException{
			String ids = request.getParameter("ids");
			System.out.println("ids==============="+ids);
			String[] sids = ids.split(",");
			System.out.println("recovery====="+sids[0]);
			int[]  iids=new int[10];
			for(int i=0;i<sids.length;i++){
				System.out.println(sids[i]);
				int a=Integer.parseInt(sids[i]);
				iids[i]=a;
			}
			int recoveryPatient = patientService.recoveryPatient(iids);
			response.setCharacterEncoding("utf-8");
			if(recoveryPatient>0){
				response.getWriter().write("success");
			}else{
				response.getWriter().write("error");
			}
		}
	//跳转到修改患者信息并传值
		@RequestMapping(value="/updateResource",method=RequestMethod.GET)
		public String jumpUpdatePatient(HttpServletRequest req,HttpServletResponse resp,Model model){
			String patient_id=req.getParameter("patient_id");
			System.out.println("this   jump!!!");
			int pat_id=Integer.parseInt(patient_id);
			patientEntity.setPatient_id(pat_id);
			com.imt.pat.entity.patientEntity queryPatientById = patientService.queryPatientById(patientEntity);
			model.addAttribute("patient",queryPatientById);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dates=sdf.format(queryPatientById.getReport_date());
			Date update_dat= queryPatientById.getUpdate_date();
			String update_dates="";
			if(update_dat!=null){
				update_dates=sdf.format(update_dat);
			}
			
			uploadText up=new uploadText();
			String txt=up.readFileByLines(queryPatientById.getUe());
			List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
			model.addAttribute("allUser", queryAllEmp);
			model.addAttribute("uetxt",txt);
			Integer id=(Integer) req.getSession().getAttribute("currSysUserId");
			String name=(String) req.getSession().getAttribute("currsysuser");
			sysUserEntity.setSys_user_id(queryPatientById.getSys_user_id());
			SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
			sysUserEntity.setSys_user_id(queryPatientById.getReport_user_id());
			SysUserEntity querySysUserById2 = sysUserService.querySysUserById(sysUserEntity);
			sysUserEntity.setSys_user_Cname(name);
			sysUserEntity.setSys_user_id(id);
			String queryCountryById = patientService.queryCountryById(queryPatientById.getPatient_consultation_country());
			String queryDiseaseById = patientService.queryDiseaseById(queryPatientById.getPatient_entity());
			String queryNetById = patientService.queryNetById(queryPatientById.getNet());
			model.addAttribute("country", queryCountryById);
			model.addAttribute("countryId", queryPatientById.getPatient_consultation_country());
			model.addAttribute("diseaseId", queryPatientById.getPatient_entity());
			model.addAttribute("disease", queryDiseaseById);
			model.addAttribute("netId", queryPatientById.getNet());
			model.addAttribute("net", queryNetById);
			model.addAttribute("BlogUser", querySysUserById);
			model.addAttribute("Cuser", querySysUserById2);
			model.addAttribute("rep_date",dates);
			model.addAttribute("update_date",update_dates);
			Date rep_datel = queryPatientById.getRep_datel();
			if(rep_datel!=null){
			String rdates=sdf.format(rep_datel);
			model.addAttribute("rep_datel",rdates);
			}
			return "updatePat";
		}
		//修改患者信息
		@RequestMapping(value="/updatePatient",method=RequestMethod.POST)
		public void UpdatePatient(HttpServletRequest req,HttpServletResponse response
				) throws ParseException, IOException{
			String pat_sex=req.getParameter("pat_sex");
			int age=Integer.parseInt(req.getParameter("pat_age"));
			System.out.println(req.getParameter("pat_age"));
			String phone=req.getParameter("con_phone");
			int pat_id=Integer.parseInt(req.getParameter("pat_id"));
			String countryname=req.getParameter("con_country");
			patientEntity.setPatient_id(pat_id);
			String pat_name=req.getParameter("pat_name");
			String pat_sysptom=req.getParameter("pat_sysptom");
			String pat_entity=req.getParameter("pat_entity");
			String report=req.getParameter("report");
			String remark=req.getParameter("remark");
			String pat_address=req.getParameter("pat_address");
			String con_address=req.getParameter("con_address");
			String con_email=req.getParameter("con_email");
			String con_name=req.getParameter("con_name");
			String critical=req.getParameter("critical");
			String resource=req.getParameter("resource");
			String hospital=req.getParameter("hospital");
			//String rep_datel=req.getParameter("rep_datel");
			String pat_con_rel=req.getParameter("pat_con_rel");
			String passport=req.getParameter("passport");
			String pat_intion_lev=req.getParameter("pat_intion_lev");
			int pat_lev=Integer.parseInt(pat_intion_lev);
			String luru=req.getParameter("luru");
			int lu=Integer.parseInt(luru);
			String zhiban=req.getParameter("zhiban");
			int zhi=Integer.parseInt(zhiban);
			com.imt.pat.entity.patientEntity queryPatientById = patientService.queryPatientById(patientEntity);
			queryPatientById.setConsultation_address(con_address);
			queryPatientById.setConsultation_email(con_email);
			queryPatientById.setCritical_state(critical);
			queryPatientById.setHospital_state(hospital);
			queryPatientById.setPatient_address(pat_address);
			queryPatientById.setPatient_age(age);
			queryPatientById.setPatient_consultation_country(Integer.parseInt(countryname));
			queryPatientById.setPatient_consultation_name(con_name);
			queryPatientById.setPatient_consultation_phone(phone);
			queryPatientById.setPatient_consultation_relation(pat_con_rel);
			queryPatientById.setPatient_entity(Integer.parseInt(pat_entity));
			queryPatientById.setPatient_id(pat_id);
			queryPatientById.setPatient_intention_level(pat_lev);
			queryPatientById.setPatient_isDel(0);
			queryPatientById.setPatient_name(pat_name);
			queryPatientById.setPatient_passport_state(passport);
			queryPatientById.setPatient_report_state(report);
			queryPatientById.setPatient_sex(pat_sex);
			queryPatientById.setPatient_sysptom(pat_sysptom);
			queryPatientById.setRemark(remark);
			queryPatientById.setResource_state(resource);
			queryPatientById.setReport_user_id(lu);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			queryPatientById.setUpdate_date(new Date());
			if("yes".equals(report)){
				System.out.println("this is  report ===yes"+new Date());
				queryPatientById.setRep_datel(new Date());
			}else{
				System.out.println("this is  report ===no");
				queryPatientById.setRep_datel(null);
			}
			/*
			 * 将文本框的内容保存到本地F：//text
			 * */
			/*String uetext=req.getParameter("uetext");
			UUID uuid=UUID.randomUUID();
			System.out.println("uuid======"+uuid);
			uploadText up=new uploadText();
			up.saveAsFileWriter(uetext, uuid);
			String ue="F:/text/"+uuid+".txt";*/
			
			/*String[] rep_datels=rep_datel.split("/");
			String format = sdf.format(new Date());
			String times="";
			Date date=null;
			if(rep_datel!=null&&!("".equals(rep_datel))){
				times=rep_datels[2]+"-"+rep_datels[0]+"-"+rep_datels[1]+format.substring(10);
				date=sdf.parse(times);
			}
			queryPatientById.setRep_datel(date);*/
			/*queryPatientById.setUe(ue);*/
			int updatePatient = patientService.updatePatiento(queryPatientById);
			response.setCharacterEncoding("utf-8");
			if(updatePatient>0){
				response.getWriter().write("success");
			}else{
				response.getWriter().write("error");
			}
		}
		//通过名字模糊查询患者
		@RequestMapping(value="/Template/queryPatientByText")
		public String queryPatientByText(HttpServletRequest request,HttpServletResponse response,Model model) throws UnsupportedEncodingException{
			String patient_isDel=request.getParameter("patient_isDel");
			int jobId=(Integer) request.getSession().getAttribute("currJobId");
			int isDel=Integer.parseInt(patient_isDel);
			patientEntity.setPatient_isDel(isDel);
			int patient_isDels=Integer.parseInt(patient_isDel);
			String pindex=request.getParameter("pindex");
			Integer uId=(Integer)request.getSession().getAttribute("currSysUserId");
			int ipindex=Integer.parseInt(pindex);
			int offset=(ipindex-1)*10;
			int startlimit=10;
			pageLimit.setOffset(offset);
			pageLimit.setStartlimit(startlimit);
			pageLimit.setPatient_isDel(0);
			//get提交乱码问题，原因提交的时候tomcat默认的是iso的，需要转换格式
			String name=new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
			System.out.println("name========"+name);
			pageLimit.setPatient_name(name);
			response.setCharacterEncoding("utf-8");
			if(jobId==1){
				pageLimit.setSys_user_id(uId);
			}else{
				pageLimit.setReport_user_id(uId);
			}
			List<patientEntity> queryPatientByText =patientService.queryPatientByText(pageLimit);
			//查询所有患者总数
			int queryAllPatientCount=patientService.queryPatientByTextCount(pageLimit);
			int currpage=queryAllPatientCount/startlimit;
			int spagesize=queryAllPatientCount%10;
			int nowpage=0;
			if(spagesize==0){
					nowpage=currpage;
			}else{
				nowpage=currpage+1;
			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			for (patientEntity p : queryPatientByText) {
				String times= df.format(p.getReport_date());
				/*Date dates=df.parse(times);
				p.setReport_date(dates);
				System.out.println("times==="+times+"dates==="+dates);*/
				p.setRep_date(times);
			}
			List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
			model.addAttribute("allUser", queryAllEmp);
			List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
			model.addAttribute("allDepl", queryAllDep);
			//设置分页信息
			pageLimitAll.setPindex(ipindex);
			pageLimitAll.setPcount(queryAllPatientCount);
			pageLimitAll.setPtotalpages(nowpage);
			pageLimitAll.setPsize(startlimit);
			request.setAttribute("page", pageLimitAll); 
			//model.addAttribute("patientList", queryAllPatientCount);
			System.out.println("count========="+queryAllPatientCount);
			System.out.println("list=="+queryPatientByText.size());
			request.setAttribute("patientList", queryPatientByText);
			return "find-1";
		}
		//电话查重
		@RequestMapping(value="/Template/testPhone",method=RequestMethod.POST)
		public void testPhone(HttpServletRequest req,HttpServletResponse resp) throws IOException{
			String phone=req.getParameter("phone");
			String iphone =phone;
			if(phone.length()>8){
				iphone=phone.substring(4);
			}
			List<com.imt.pat.entity.patientEntity> testPhone = patientService.testPhone(iphone);
			resp.setCharacterEncoding("utf-8");
			if(testPhone.size()>0){
				resp.getWriter().write("patId="+testPhone.get(0).getPatient_id());
				System.out.println("size=======1");
			}else{
				resp.getWriter().write("error");
				System.out.println("size========0");
			}
			System.out.println("截取的电话为===="+iphone);
		}
		//邮箱查重
		@RequestMapping(value="/Template/testEmail",method=RequestMethod.POST)
		public void testEmail(HttpServletRequest req,HttpServletResponse resp) throws IOException{
			String email=req.getParameter("email");
			List<com.imt.pat.entity.patientEntity> testEmail = patientService.testEmail(email);
			resp.setCharacterEncoding("utf-8");
			if(testEmail.size()>0){
				resp.getWriter().write("patId="+testEmail.get(0).getPatient_id());
				System.out.println("size=======1");
			}else{
				resp.getWriter().write("error");
				System.out.println("size========0");
			}
			System.out.println("邮箱 ===="+email);
		}
		//网站权重
		@RequestMapping(value="/netWeight")
		public String netWeight(HttpServletRequest req,HttpServletResponse resp,Model model) throws ParseException{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date=new Date();
			String format = sdf.format(date);
			String[] rep_datels=format.split("-");
			String day = rep_datels[2];
			String month=rep_datels[1];
			String year=rep_datels[0];
			int mont=Integer.parseInt(month);
			int dday=Integer.parseInt(day);
			int yyear=Integer.parseInt(year);
			if(dday-1==0){
				mont=mont-1;
			}else{
				dday-=1;
			}
			if(mont-1==0){
				yyear-=1;
			}
			String qdatel=yyear+"-"+mont+"-"+dday;
			String qdate=sdf.format(sdf.parse(qdatel));
			System.out.println("要查询的上一天时间为===================="+qdate);
			List<Net> queryAllNet = patientService.queryAllNet();
			List<ResCount> res=new ArrayList<ResCount>();
			
			for(Net n:queryAllNet){
				int queryTodayRes = patientService.queryTodayRes(format,n.getId());
				int queryLastRes = patientService.queryLastRes(qdate,n.getId());
				String queryNetById = patientService.queryNetById(n.getId());
				ResCount re=new ResCount();
				re.setLastCount(queryLastRes);
				re.setTodatCount(queryTodayRes);
				re.setNet(queryNetById);
				res.add(re);
			}
			System.out.println("查询到的 权重  list大小为=="+res.size());
			model.addAttribute("res", res);
			return "netWeight";
		}
}
