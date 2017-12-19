package com.imt.pat.entity;

import java.io.Serializable;
import java.util.Date;

public class patientEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rep_date;
	private int net;//网址来源id
	public int getNet() {
		return net;
	}
	public void setNet(int net) {
		this.net = net;
	}
	private String patient_name;
	private int patient_id;
	private int sys_user_id;
	private int patient_age;
	private String patient_sex;
	private String patient_consultation_name;//咨询人名字
	private int patient_consultation_country;//咨询人国家
	private String country;//中文国家
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String patient_consultation_phone;//咨询人电话
	private String patient_sysptom;//咨询人症状
	private int patient_entity;//咨询人病种
	private int patient_intention_level;//患者意向程度
	private String patient_report_state;//是否报备
	private String patient_passport_state;//患者签证状态
	private String remark;//备注
	private String patient_address;//患者住址
	private String patient_consultation_relation;//患者跟咨询者的关系
	private String consultation_address;//咨询者的住址
	private String consultation_email;//咨询者的邮箱
	private String critical_state;//是否紧急
	private String resource_state;//资源是否有效
	private String hospital_state;//是否住院
	private Date report_date;//报备时间
	private int patient_isDel;//是否删除了
	private String ue;//文本框的内容
	private int report_user_id;//客服的id
	private String reportName;//客服中文名字
	private Date rep_datel;//报备时间
	private String rep_dates;//前台显示报备时间
	private Date update_date;//最后修改时间
	
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public Date getRep_datel() {
		return rep_datel;
	}
	public void setRep_datel(Date rep_datel) {
		this.rep_datel = rep_datel;
	}
	public String getRep_dates() {
		return rep_dates;
	}
	public void setRep_dates(String rep_dates) {
		this.rep_dates = rep_dates;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public int getReport_user_id() {
		return report_user_id;
	}
	public void setReport_user_id(int report_user_id) {
		this.report_user_id = report_user_id;
	}
	public int getPatient_isDel() {
		return patient_isDel;
	}
	public void setPatient_isDel(int patient_isDel) {
		this.patient_isDel = patient_isDel;
	}
	public String getUe() {
		return ue;
	}
	public void setUe(String ue) {
		this.ue = ue;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getSys_user_id() {
		return sys_user_id;
	}
	public void setSys_user_id(int sys_user_id) {
		this.sys_user_id = sys_user_id;
	}
	public int getPatient_age() {
		return patient_age;
	}
	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}
	public String getPatient_sex() {
		return patient_sex;
	}
	public void setPatient_sex(String patient_sex) {
		this.patient_sex = patient_sex;
	}
	public String getPatient_consultation_name() {
		return patient_consultation_name;
	}
	public void setPatient_consultation_name(String patient_consultation_name) {
		this.patient_consultation_name = patient_consultation_name;
	}
	public String getPatient_consultation_phone() {
		return patient_consultation_phone;
	}
	public String setPatient_consultation_phone(String patient_consultation_phone) {
		return this.patient_consultation_phone = patient_consultation_phone;
	}
	public String getPatient_sysptom() {
		return patient_sysptom;
	}
	public void setPatient_sysptom(String patient_sysptom) {
		this.patient_sysptom = patient_sysptom;
	}
	public int getPatient_consultation_country() {
		return patient_consultation_country;
	}
	public void setPatient_consultation_country(int patient_consultation_country) {
		this.patient_consultation_country = patient_consultation_country;
	}
	public int getPatient_entity() {
		return patient_entity;
	}
	public void setPatient_entity(int patient_entity) {
		this.patient_entity = patient_entity;
	}
	public int getPatient_intention_level() {
		return patient_intention_level;
	}
	public void setPatient_intention_level(int patient_intention_level) {
		this.patient_intention_level = patient_intention_level;
	}
	public String getPatient_report_state() {
		return patient_report_state;
	}
	public void setPatient_report_state(String patient_report_state) {
		this.patient_report_state = patient_report_state;
	}
	public String getPatient_passport_state() {
		return patient_passport_state;
	}
	public void setPatient_passport_state(String patient_passport_state) {
		this.patient_passport_state = patient_passport_state;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getPatient_consultation_relation() {
		return patient_consultation_relation;
	}
	public void setPatient_consultation_relation(
			String patient_consultation_relation) {
		this.patient_consultation_relation = patient_consultation_relation;
	}
	public String getConsultation_address() {
		return consultation_address;
	}
	public void setConsultation_address(String consultation_address) {
		this.consultation_address = consultation_address;
	}
	public String getConsultation_email() {
		return consultation_email;
	}
	public void setConsultation_email(String consultation_email) {
		this.consultation_email = consultation_email;
	}
	public String getCritical_state() {
		return critical_state;
	}
	public void setCritical_state(String critical_state) {
		this.critical_state = critical_state;
	}
	public String getResource_state() {
		return resource_state;
	}
	public void setResource_state(String resource_state) {
		this.resource_state = resource_state;
	}
	public String getHospital_state() {
		return hospital_state;
	}
	public void setHospital_state(String hospital_state) {
		this.hospital_state = hospital_state;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getRep_date() {
		return rep_date;
	}
	public void setRep_date(String rep_date) {
		this.rep_date = rep_date;
	}
}
