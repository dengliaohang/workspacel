package com.imt.sys.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imt.pat.entity.Country;
import com.imt.pat.entity.Disease;
import com.imt.pat.entity.Net;
import com.imt.pat.entity.patientEntity;
import com.imt.pat.service.PatientService;
import com.imt.sys.entity.DepartmentEntity;
import com.imt.sys.entity.JobEntity;
import com.imt.sys.entity.PageLimit;
import com.imt.sys.entity.PageLimitAll;
import com.imt.sys.entity.SysUserEntity;
import com.imt.sys.service.SysUserService;

@Controller
public class SysMenuManageController {
	private SysUserEntity sysUserEntity=new SysUserEntity();
	private PageLimit pageLimit=new PageLimit();
	private PageLimitAll pageLimitAll=new PageLimitAll();
	private DepartmentEntity departmentEntity=new DepartmentEntity();
	private JobEntity jobEntity=new JobEntity();
	private Country country=new Country();
	private Disease disease=new Disease();
	private Net net=new Net();
	private com.imt.pat.entity.PageLimit pageLimitp=new com.imt.pat.entity.PageLimit();
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private PatientService patSer;
	/*
	 * 跳转到添加员工界面，包含职位，部门信息
	 * */
	@RequestMapping(value="/addEmployeejump")
	public String addEmployeejump(Model mod){
		  List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
		mod.addAttribute("department", queryAllDep);
		List<JobEntity> queryJob=sysUserService.queryAllJob();
		mod.addAttribute("job", queryJob);
		return "addEmployee";
	}
	
	/*
	 * 跳转到部门管理页面，并将部门的信息传进去list
	 * */
	@RequestMapping(value="/Template/manageDep")
	public String manageDep(HttpServletRequest req,HttpServletResponse resp,Model model){
		String pindex=req.getParameter("pindex");
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		List<DepartmentEntity> queryAllDep = sysUserService.queryAllDepl(pageLimit);
		model.addAttribute("allDep", queryAllDep);
		//查询数量
		int queryDepCount = sysUserService.queryDepCount();
		//model.addAttribute("count", queryDepCount);
		int currpage=queryDepCount/startlimit;
		int spagesize=queryDepCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(ipindex);
		pageLimitAll.setPcount(queryDepCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		//model.addAttribute("patientList", queryAllPatientCount);
		System.out.println("count========="+queryDepCount);
		return "manageDep";
	}
	/*
	 * 添加部门
	 * */
	@RequestMapping(value="/Template/addDep")
	public void addDep(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String dep=req.getParameter("department");
		int addDep = sysUserService.addDep(dep);
		resp.setCharacterEncoding("utf-8");
		if(addDep>0){
			 resp.getWriter().write("success");
		}else{
			 resp.getWriter().write("error");
		}
	}
	/*
	 * 修改部门跳转传值
	 * */
	@RequestMapping(value="/updateDep")
	public String updateDep(HttpServletRequest req,HttpServletResponse resp){
		String id=req.getParameter("id");
		String queryDepById = sysUserService.queryDepById(Integer.parseInt(id));
		req.setAttribute("name", queryDepById);
		req.setAttribute("id", id);
		return "updateDep";
	}
	//修改部门
	@RequestMapping(value="/updateDepl")
	public void updateDepl(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String updateTxt=req.getParameter("updateTxt");
		String id=req.getParameter("id");
		departmentEntity.setId(Integer.parseInt(id));
		departmentEntity.setName(updateTxt);
		int updateDepl = sysUserService.updateDepl(departmentEntity);
		resp.setCharacterEncoding("utf-8");
		if(updateDepl>0){
			 resp.getWriter().write("success");
		}else{
			 resp.getWriter().write("error");
		}
	}
	/*
	 * 跳转到职位管理页面，并将职位的信息传进去list
	 * */
	@RequestMapping(value="/Template/manageJob")
	public String manageJob(HttpServletRequest req,HttpServletResponse resp,Model model){
		String pindex=req.getParameter("pindex");
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		List<JobEntity> queryAllDep = sysUserService.queryAllJobl(pageLimit);
		model.addAttribute("allDep", queryAllDep);
		//查询数量
		int queryDepCount = sysUserService.queryJobCount();
		//model.addAttribute("count", queryDepCount);
		int currpage=queryDepCount/startlimit;
		int spagesize=queryDepCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(ipindex);
		pageLimitAll.setPcount(queryDepCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		//model.addAttribute("patientList", queryAllPatientCount);
		System.out.println("count========="+queryDepCount);
		return "manageJob";
	}
	/*
	 * 修改职位跳转传值
	 * */
	@RequestMapping(value="/updateJob")
	public String updateJob(HttpServletRequest req,HttpServletResponse resp){
		String id=req.getParameter("id");
		String queryDepById = sysUserService.queryJobById(Integer.parseInt(id));
		req.setAttribute("name", queryDepById);
		req.setAttribute("id", id);
		return "updateJob";
	}
	//修改职位
		@RequestMapping(value="/updateJobl")
		public void updateJobl(HttpServletRequest req,HttpServletResponse resp) throws IOException{
			String updateTxt=req.getParameter("updateTxt");
			String id=req.getParameter("id");
			jobEntity.setId(Integer.parseInt(id));
			jobEntity.setName(updateTxt);
			int updateDepl = sysUserService.updateJobl(jobEntity);
			resp.setCharacterEncoding("utf-8");
			if(updateDepl>0){
				 resp.getWriter().write("success");
			}else{
				 resp.getWriter().write("error");
			}
		}
	/*
	 * 添加职位
	 * */
	@RequestMapping(value="/Template/addJob")
	public void addJob(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String dep=req.getParameter("department");
		int addDep = sysUserService.addJob(dep);
		resp.setCharacterEncoding("utf-8");
		if(addDep>0){
			 resp.getWriter().write("success");
		}else{
			 resp.getWriter().write("error");
		}
	}
	/*
	 * 跳转到网站管理页面，并将网站的信息传进去list
	 * */
	@RequestMapping(value="/Template/manageNet")
	public String manageNet(HttpServletRequest req,HttpServletResponse resp,Model model){
		String pindex=req.getParameter("pindex");
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimitp.setOffset(offset);
		pageLimitp.setStartlimit(startlimit);
		List<Net> queryAllDep = patSer.queryAllNetl(pageLimitp);
		model.addAttribute("allDep", queryAllDep);
		//查询数量
		int queryDepCount = patSer.queryNetCount();
		//model.addAttribute("count", queryDepCount);
		int currpage=queryDepCount/startlimit;
		int spagesize=queryDepCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(ipindex);
		pageLimitAll.setPcount(queryDepCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		//model.addAttribute("patientList", queryAllPatientCount);
		System.out.println("count========="+queryDepCount);
		return "manageNet";
	}
	/*
	 * 修改网站跳转传值
	 * */
	@RequestMapping(value="/updateNet")
	public String updateNet(HttpServletRequest req,HttpServletResponse resp){
		String id=req.getParameter("id");
		String queryDepById = patSer.queryNetById(Integer.parseInt(id));
		req.setAttribute("name", queryDepById);
		req.setAttribute("id", id);
		return "updateNet";
	}
	//修改网址
		@RequestMapping(value="/updateNetl")
		public void updateNetl(HttpServletRequest req,HttpServletResponse resp) throws IOException{
			String updateTxt=req.getParameter("updateTxt");
			String id=req.getParameter("id");
			net.setId(Integer.parseInt(id));
			net.setName(updateTxt);
			int updateDepl = patSer.updateNetl(net);
			resp.setCharacterEncoding("utf-8");
			if(updateDepl>0){
				 resp.getWriter().write("success");
			}else{
				 resp.getWriter().write("error");
			}
		}
	/*
	 * 添加网站
	 * */
	@RequestMapping(value="/Template/addNet")
	public void addNet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String dep=req.getParameter("department");
		int addDep = patSer.addNet(dep);
		resp.setCharacterEncoding("utf-8");
		if(addDep>0){
			 resp.getWriter().write("success");
		}else{
			 resp.getWriter().write("error");
		}
	}
	/*
	 * 跳转到国家管理页面，并将国家的信息传进去list
	 * */
	@RequestMapping(value="/Template/manageCoun")
	public String manageCoun(HttpServletRequest req,HttpServletResponse resp,Model model){
		String pindex=req.getParameter("pindex");
		int ipindex=Integer.parseInt(pindex);
		int offset=(ipindex-1)*10;
		int startlimit=10;
		pageLimitp.setOffset(offset);
		pageLimitp.setStartlimit(startlimit);
		List<Country> queryAllDep = patSer.queryAllCountryl(pageLimitp);
		model.addAttribute("allDep", queryAllDep);
		//查询数量
		int queryDepCount = patSer.queryCountryCount();
		//model.addAttribute("count", queryDepCount);
		int currpage=queryDepCount/startlimit;
		int spagesize=queryDepCount%10;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
		}else{
			nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(ipindex);
		pageLimitAll.setPcount(queryDepCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		req.setAttribute("page", pageLimitAll); 
		//model.addAttribute("patientList", queryAllPatientCount);
		System.out.println("count========="+queryDepCount);
		return "manageCoun";
	}
	/*
	 * 添加国家
	 * */
	@RequestMapping(value="/Template/addCoun")
	public void addCoun(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String dep=req.getParameter("department");
		int addDep = patSer.addCoun(dep);
		resp.setCharacterEncoding("utf-8");
		if(addDep>0){
			 resp.getWriter().write("success");
		}else{
			 resp.getWriter().write("error");
		}
	}
	/*
	 * 修改国家跳转传值
	 * */
	@RequestMapping(value="/updateCoun")
	public String updateCoun(HttpServletRequest req,HttpServletResponse resp){
		String id=req.getParameter("id");
		String queryDepById = patSer.queryCountryById(Integer.parseInt(id));
		req.setAttribute("name", queryDepById);
		req.setAttribute("id", id);
		return "updateCoun";
	}
	//修改国家
		@RequestMapping(value="/updateCounl",method=RequestMethod.POST)
		public void updateCounl(HttpServletRequest req,HttpServletResponse resp) throws IOException{
			String updateTxt=req.getParameter("updateTxt");
			String id=req.getParameter("id");
			System.out.println(id+updateTxt);
			country.setId(Integer.parseInt(id));
			country.setName(updateTxt);
			int updateDepl = patSer.updateCountryl(country);
			System.out.println(country.getId()+"guojia==="+country.getName()+"return===="+updateDepl);
			resp.setCharacterEncoding("utf-8");
			if(updateDepl>0){
				 resp.getWriter().write("success");
			}else{
				 resp.getWriter().write("error");
			}
		}
	/*
	 * 信息录入跳转,传入所有人员信息
	 * 还有病种 国家 之类的信息
	 * */
	@RequestMapping(value="/Template/find")
	public String find(HttpServletRequest request,Model mod){
		Integer id=(Integer) request.getSession().getAttribute("currSysUserId");
		String name=(String) request.getSession().getAttribute("currsysuser");
		List<Country> queryAllCountry = patSer.queryAllCountry();
		List<Disease> queryAllDisease = patSer.queryAllDisease();
		List<Net> queryAllNet = patSer.queryAllNet();
		mod.addAttribute("allCountry", queryAllCountry);
		mod.addAttribute("allDisease", queryAllDisease);
		mod.addAttribute("allNet", queryAllNet);
		sysUserEntity.setSys_user_Cname(name);
		sysUserEntity.setSys_user_id(id);
		SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
		mod.addAttribute("Cuser", querySysUserById);
		List<SysUserEntity> queryAllEmp = sysUserService.queryAllEmp();
		System.out.println("查询到的EMP====="+queryAllEmp.size());
		List<DepartmentEntity> queryAllDep = sysUserService.queryAllDep();
		mod.addAttribute("allDepl", queryAllDep);
		mod.addAttribute("allUser", queryAllEmp);
		return "find";
		
	}
	/*
	 * 管理员添加新员工
	 * */
	@RequestMapping(value="/Template/addEmployee",method=RequestMethod.POST)
	public void addEmployee(HttpServletRequest request,HttpServletResponse response ) throws IOException{
		System.out.println("zoujinlaile+++++");
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		String sys_user_Cname=request.getParameter("Cname");
		String jobId=request.getParameter("job");
		int jId=Integer.parseInt(jobId);
		String depId=request.getParameter("department");
		int dId=Integer.parseInt(depId);
		sysUserEntity.setSys_user_name(username);
		sysUserEntity.setSys_user_password(password);
		sysUserEntity.setSys_user_Cname(sys_user_Cname);
		sysUserEntity.setDepartment_id(dId);
		sysUserEntity.setJob_id(jId);
		sysUserEntity.setSys_user_state(0);
		sysUserEntity.setSys_user_id(0);
		sysUserEntity.setSys_user_able(0);
		SysUserEntity querySysUser=sysUserService.querySysUserByname(sysUserEntity);
		response.setCharacterEncoding("utf-8");
		if(null!=querySysUser&&querySysUser.getSys_user_isDel()==0){
			System.out.println("添加失敗");
			response.getWriter().write("errorno");
		}else{
			 sysUserEntity.setSys_user_isDels(1);
			 int addEmployee = sysUserService.addEmployee(sysUserEntity);
			 System.out.println("添加成功==="+addEmployee);
			 response.getWriter().write("success");
		}
	}
	
	/*
	 * 员工查询all
	 * */
	@RequestMapping(value="/queryAllEmployee",method=RequestMethod.GET)
	public String queryAllEmployee( HttpServletRequest request,
			@RequestParam("pindex") int pindex,
			@RequestParam("pcount") int pcount,
			Model model){
		int offset=(pindex-1)*5;
		int startlimit=5;
		pageLimit.setOffset(offset);
		pageLimit.setStartlimit(startlimit);
		System.out.println("pianyi======="+startlimit+offset);
		List<SysUserEntity> queryAllEmployee = sysUserService.queryAllEmployee(pageLimit);
		for(SysUserEntity s:queryAllEmployee){
			String queryDepById = sysUserService.queryDepById(s.getDepartment_id());
			s.setDepartment(queryDepById);
		}
		//写一个查询总记录
		int queryEmployeeCount = sysUserService.queryEmployeeCount();
		int currpage=queryEmployeeCount/startlimit;
		int spagesize=queryEmployeeCount%5;
		int nowpage=0;
		if(spagesize==0){
				nowpage=currpage;
			}else{
				nowpage=currpage+1;
		}
		//设置分页信息
		pageLimitAll.setPindex(pindex);
		pageLimitAll.setPcount( queryEmployeeCount);
		pageLimitAll.setPtotalpages(nowpage);
		pageLimitAll.setPsize(startlimit);
		request.setAttribute("page", pageLimitAll); 
		model.addAttribute("sysuserQuery", queryAllEmployee);
		System.out.println("count========="+queryEmployeeCount);
		return "querySysUser";
	}
	
	/*
	 * 员工查询byCname
	 * */
	@RequestMapping(value="/queryEmployeeByCname",method=RequestMethod.GET)
	public String queryEmployeeByCname(@RequestParam("querybyname") String userCname,Model model){
		sysUserEntity.setSys_user_Cname(userCname);
		sysUserEntity.setSys_user_isDels(0);
		SysUserEntity querySysUser = sysUserService.querySysUserByCname(sysUserEntity);
		List<SysUserEntity> querySysUser1=new ArrayList<SysUserEntity>();
		if(null!=querySysUser){
		querySysUser1.add(querySysUser);
		}
			model.addAttribute("sysuserQuery", querySysUser1);
			return "querySysUser";
	}
	
	/*
	 * 跳转到修改资料页面
	 * 
	 * */
	@RequestMapping(value="/updateEmployee",method=RequestMethod.GET)
	public String jumpUpdateEmployee(HttpServletRequest request,
			@RequestParam("id") String id,
			Model model){
		int iid=Integer.parseInt(id);
		sysUserEntity.setSys_user_id(iid);
		SysUserEntity querySysUserById = sysUserService.querySysUserById(sysUserEntity);
		sysUserEntity.setSys_user_Cname(querySysUserById.getSys_user_Cname());
		sysUserEntity.setSys_user_name(querySysUserById.getSys_user_name());
		sysUserEntity.setSys_user_password(querySysUserById.getSys_user_password());
		sysUserEntity.setSys_user_id(iid);
		model.addAttribute("updateuser",sysUserEntity );
		return "updateEmployee";
	}
	
	/*
	 * 修改员工资料
	 * */
	@RequestMapping(value="/updateEmp",method=RequestMethod.POST)
	public void updateEmp(HttpServletResponse resp,HttpServletRequest req) throws IOException{
			sysUserEntity.setSys_user_Cname(req.getParameter("sys_user_Cname"));
			sysUserEntity.setSys_user_isDels(0);
			sysUserEntity.setSys_user_id(Integer.parseInt(req.getParameter("user_id")));
			//SysUserEntity querySysUserByCname=sysUserService.querySysUserById(sysUserEntity);
			sysUserEntity.setSys_user_name(req.getParameter("sys_user_name"));
			sysUserEntity.setSys_user_password(req.getParameter("sys_user_password"));
			int empName = sysUserService.updateEmpName(sysUserEntity);
			resp.setCharacterEncoding("utf-8");
			System.out.println("xiugai ==========="+empName);
			resp.getWriter().write("success");
	}
	/*
	 * 删除员工
	 * */
	@RequestMapping(value="/deleteSysUser",method=RequestMethod.POST)
	public void deleteSysUser(HttpServletRequest req,HttpServletResponse resp) throws IOException{
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
		int deleteSysUser = sysUserService.deleteSysUser(iids);
		System.out.println("刪除了=========="+deleteSysUser);
		resp.setCharacterEncoding("utf-8");
		if(deleteSysUser>0){
			resp.getWriter().write("success");
		}else{
			resp.getWriter().write("error");
		}
	}
	//禁用/恢复员工
	@RequestMapping(value="/disableSysUser",method=RequestMethod.POST)
	public void disableSysUser(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String id = req.getParameter("id");
		int ids=Integer.parseInt(id);
		sysUserEntity.setSys_user_id(ids);
		String able=req.getParameter("able");
		int ables=Integer.parseInt(able);
		sysUserEntity.setSys_user_able(ables);
		int disableSysUser = sysUserService.disableSysUser(sysUserEntity);
		resp.setCharacterEncoding("utf-8");
		if(disableSysUser>0){
			resp.getWriter().write("success");
		}else{
			resp.getWriter().write("error");
		}
	}
}
