package com.deng.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	@Override
	public String toString() {
		return "User [id=" + id + ", createDate=" + createDate + ", username="
				+ username + ", password=" + password + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date createDate;
	private String username;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
