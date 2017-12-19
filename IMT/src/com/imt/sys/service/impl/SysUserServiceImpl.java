package com.imt.sys.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imt.sys.dao.SysUserDao;
import com.imt.sys.entity.DepartmentEntity;
import com.imt.sys.entity.JobEntity;
import com.imt.sys.entity.PageLimit;
import com.imt.sys.entity.SysUserEntity;
import com.imt.sys.service.SysUserService;


/*/ 系统用户
 * 
 */
@Service
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserDao sysUserDao;
	
	//查询用户
	@Override
	public SysUserEntity querySysUser(SysUserEntity sysuser) {
		// TODO Auto-generated method stub
		return sysUserDao.querySysUser(sysuser);
	}
	// 增加员工
	@Override
	public int addEmployee(SysUserEntity sysuser) {
		sysUserDao.addEmployee(sysuser);
		return 0;
	}
	//通过用户名查询
	@Override
	public SysUserEntity querySysUserByCname(SysUserEntity sysuser) {
		// TODO Auto-generated method stub
		
		return sysUserDao.querySysUserByCname(sysuser);
	}
	
	/*
	 * 查询所有员工
	 * */
	@Override
	public List<SysUserEntity> queryAllEmployee(PageLimit pageLimit) {
		// TODO Auto-generated method stub
		return 	sysUserDao.queryAllEmployee(pageLimit);
	}

	
	//查询员工数量
	@Override
	public int queryEmployeeCount() {
		// TODO Auto-generated method stub
		
		return sysUserDao.queryEmployeeCount();
	}
	
	//修改员工用户名
	@Override
	public int updateEmpName(SysUserEntity sysUserEntity) {
		// TODO Auto-generated method stub
		sysUserDao.updateEmpName(sysUserEntity);
		return 0;
	}
	//修改员工姓名
	@Override
	public int updateEmpCname(SysUserEntity sysUserEntity) {
		// TODO Auto-generated method stub
		sysUserDao.updateEmpCname(sysUserEntity);
		return 0;
	}
	//修改员工密码
	@Override
	public int updateEmpPassword(SysUserEntity sysUserEntity) {
		// TODO Auto-generated method stub
		sysUserDao.updateEmpPassword(sysUserEntity);
		return 0;
	}
	//查询员工byname
	@Override
	public SysUserEntity querySysUserByname(SysUserEntity sysuser) {
		// TODO Auto-generated method stub
		
		return sysUserDao.querySysUserByname(sysuser);
	}
	//删除员工，批量删除
	@Override
	public int deleteSysUser(int[] ids) {
		
		return sysUserDao.deleteSysUser(ids);
	}
	//通过id查询用户
	@Override
	public SysUserEntity querySysUserById(SysUserEntity sysuser) {
		// TODO Auto-generated method stub
		return sysUserDao.querySysUserById(sysuser);
	}
	/*
	 * 禁用员工
	 * */
	@Override
	public int disableSysUser(SysUserEntity sysuser) {
		// TODO Auto-generated method stub
		return sysUserDao.disableSysUser( sysuser);
	}
	//查询所有部门信息
	@Override
	public List<DepartmentEntity> queryAllDep() {
		// TODO Auto-generated method stub
		return sysUserDao.queryAllDep();
	}
	//查询所有职业信息
	@Override
	public List<JobEntity> queryAllJob() {
		// TODO Auto-generated method stub
		
		return sysUserDao.queryAllJob();
	}
	//查询所有用户
	@Override
	public List<SysUserEntity> queryAllEmp() {
		// TODO Auto-generated method stub
		return sysUserDao.queryAllEmp();
	}
	@Override
	public List<DepartmentEntity> queryAllDepl(PageLimit p) {
		// TODO Auto-generated method stub
		return sysUserDao.queryAllDepl(p);
	}
	@Override
	public int queryDepCount() {
		// TODO Auto-generated method stub
		return sysUserDao.queryDepCount();
	}
	@Override
	public List<JobEntity> queryAllJobl(PageLimit p) {
		// TODO Auto-generated method stub
		return sysUserDao.queryAllJobl(p);
	}
	@Override
	public int queryJobCount() {
		// TODO Auto-generated method stub
		return sysUserDao.queryJobCount();
	}
	@Override
	public int addDep(String dep) {
		// TODO Auto-generated method stub
		return sysUserDao.addDep(dep);
	}
	@Override
	public int addJob(String job) {
		// TODO Auto-generated method stub
		return sysUserDao.addJob(job);
	}
	@Override
	public String queryDepById(int id) {
		// TODO Auto-generated method stub
		return sysUserDao.queryDepById(id);
	}
	@Override
	public String queryJobById(int id) {
		// TODO Auto-generated method stub
		return sysUserDao.queryJobById(id);
	}
	@Override
	public int updateDepl(DepartmentEntity dep) {
		// TODO Auto-generated method stub
		return sysUserDao.updateDepl(dep);
	}
	@Override
	public int updateJobl(JobEntity job) {
		// TODO Auto-generated method stub
		return sysUserDao.updateJobl(job);
	}

}
