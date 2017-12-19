package com.imt.sys.entity;

import java.io.Serializable;

/**
 * 系统用户
 * 
 * @author dengliaohang
 * @email dengliaohang@163.com
 * @date 2017年6月18日 下午16:49:55
 */
public class SysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户ID
	 */
	private int sys_user_id;

	/**
	 * 用户名
	 */
	private String sys_user_name;

	/**
	 * 密码
	 */
	private transient String sys_user_password;

	/**
	 * 管理员权限 0：管理员      1：普通员工
	 */
	private int sys_user_state;
	/*
	 * 部门
	 * */
	private String department;
	/**
	 * 员工中文姓名
	 */
	private String sys_user_Cname;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/*
	 * 是否删除
	 * 
	 * */
	private int sys_user_isDel;
	/*
	 * 员工是否被禁用
	 * */
	private int sys_user_able;
	/*
	 * 用户部门id
	 * */
	private int department_id;
	
	/*
	 * 用户职业id
	 * */
	private int job_id;
	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getSys_user_able() {
		return sys_user_able;
	}

	public void setSys_user_able(int sys_user_able) {
		this.sys_user_able = sys_user_able;
	}

	public void setSys_user_isDel(int sys_user_isDel) {
		this.sys_user_isDel = sys_user_isDel;
	}

	public int getSys_user_isDel() {
		return sys_user_isDel;
	}

	public void setSys_user_isDels(int sys_user_isDel) {
		this.sys_user_isDel = sys_user_isDel;
	}

	public String getSys_user_Cname() {
		return sys_user_Cname;
	}

	public void setSys_user_Cname(String sys_user_Cname) {
		this.sys_user_Cname = sys_user_Cname;
	}

	public int getSys_user_state() {
		return sys_user_state;
	}

	public void setSys_user_state(int sys_user_state) {
		this.sys_user_state = sys_user_state;
	}



	public int getSys_user_id() {
		return sys_user_id;
	}

	public void setSys_user_id(int sys_user_id) {
		this.sys_user_id = sys_user_id;
	}

	public String getSys_user_name() {
		return sys_user_name;
	}

	public void setSys_user_name(String sys_user_username) {
		this.sys_user_name = sys_user_username;
	}

	public String getSys_user_password() {
		return sys_user_password;
	}

	public void setSys_user_password(String sys_user_password) {
		this.sys_user_password = sys_user_password;
	}

	@Override
	public String toString() {
		return "SysUserEntity [sys_user_id=" + sys_user_id
				+ ", sys_user_username=" + sys_user_name
				+ ", sys_user_state=" + sys_user_state + "]";
	}

}