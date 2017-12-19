package com.imt.sys.service;


import java.util.List;

import com.imt.sys.entity.DepartmentEntity;
import com.imt.sys.entity.JobEntity;
import com.imt.sys.entity.PageLimit;
import com.imt.sys.entity.SysUserEntity;


public interface SysUserService {
	
	/*
	 * 查询员工
	 * SysUserEntity 员工
	 */
	SysUserEntity querySysUser(SysUserEntity sysuser);
	/*
	 * 添加部门
	 * */
	int addDep(String dep);
	/*
	 * 查询所有部门信息
	 * */
	List<DepartmentEntity> queryAllDep();
	List<DepartmentEntity> queryAllDepl(PageLimit p);
	int queryDepCount();
	//修改部门信息
	int updateDepl(DepartmentEntity dep);
	//通过id查询部门
	String queryDepById(int id);
	/*
	 * 查询所有职位信息
	 * */
	List<JobEntity> queryAllJob();
	List<JobEntity> queryAllJobl(PageLimit p);
	int queryJobCount();
	//修改职位信息
	int updateJobl(JobEntity job);
	//通过id查询职位
	String queryJobById(int id);
	/*
	 * 添加职位
	 * */
	int addJob(String job);
	/*
	 * 查询员工 byname
	 * */
	SysUserEntity querySysUserByname(SysUserEntity sysuser);
	
	/*
	 * 通过id查询
	 * */
	SysUserEntity querySysUserById(SysUserEntity sysuser);
	
	/*
	 * 添加员工
	 * @param SysUserEntity 员工
	 * */
	int addEmployee(SysUserEntity sysuser);
	
	/*
	 * 查询员工 byCname
	 * */
	SysUserEntity querySysUserByCname(SysUserEntity sysuser);
	/*
	 * 查询所有员工
	 * */
	 List<SysUserEntity> queryAllEmployee(PageLimit pageLimit);
		/*
		 * 
		 * 查询所有员工
		 * */
		 List<SysUserEntity> queryAllEmp();
	 
	 /*
		 * 查询所有员工数量
		 * */
	 
	 int  queryEmployeeCount();
	 /*
	  * 修改员工用户名
	  */
	 int updateEmpName(SysUserEntity sysUserEntity);
	 /*
	  * 修改员工姓名
	  * */
	 int updateEmpCname(SysUserEntity sysUserEntity);
	 /*
	  * 修改员工密码
	  * */
	 int updateEmpPassword(SysUserEntity sysUserEntity);
	 /*
	  * 删除员工
	  * */
	 int deleteSysUser(int[] ids);
	 /*
	  * 禁用员工
	  * 
	  * */
	 int disableSysUser(SysUserEntity sysuser);
	 
}
