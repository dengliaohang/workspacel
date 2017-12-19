package com.imt.pat.entity;

import java.io.Serializable;

public class PageLimit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int offset;//起始量
	private int startlimit;//偏移量
	private int patient_isDel;//是否删除
	private String currdate;//现在的时间
	private String ndate;//初始时间
	private String ldate;//现在-30天 的日期
	private int sys_user_id;//userid
	private int report_user_id;//录入人的id
	private String patient_name;//患者名字
	private int patient_consultation_country;//国家id
	private String phone;
	private String email;
	private String sys_user_state;//用户权限
	public String getSys_user_state() {
		return sys_user_state;
	}
	public void setSys_user_state(String sys_user_state) {
		this.sys_user_state = sys_user_state;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPatient_consultation_country() {
		return patient_consultation_country;
	}
	public void setPatient_consultation_country(int patient_consultation_country) {
		this.patient_consultation_country = patient_consultation_country;
	}
	public int getReport_user_id() {
		return report_user_id;
	}
	public void setReport_user_id(int report_user_id) {
		this.report_user_id = report_user_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;//模糊查询名字
	public int getSys_user_id() {
		return sys_user_id;
	}
	public void setSys_user_id(int sys_user_id) {
		this.sys_user_id = sys_user_id;
	}
	public String getCurrdate() {
		return currdate;
	}
	public void setCurrdate(String currdate) {
		this.currdate = currdate;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	public String getLdate() {
		return ldate;
	}
	public void setLdate(String ldate) {
		this.ldate = ldate;
	}

	public int getPatient_isDel() {
		return patient_isDel;
	}
	public void setPatient_isDel(int patient_isDel) {
		this.patient_isDel = patient_isDel;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getStartlimit() {
		return startlimit;
	}
	public void setStartlimit(int startlimit) {
		this.startlimit = startlimit;
	}
	@Override
	public String toString() {
		return "pageLimit [offset=" + offset + ", startlimit=" + startlimit
				+ "]";
	}
	
}
