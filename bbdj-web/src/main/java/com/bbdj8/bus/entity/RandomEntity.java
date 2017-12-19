package com.bbdj8.bus.entity;

import java.io.Serializable;



/**
 * 随机码表
 * 
 * @author liwenjun
 * @email 18623682292@163.com
 * @date 2017-03-04 11:28:13
 */
public class RandomEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//随机码
	private String randomno;

	/**
	 * 设置：随机码
	 */
	public void setRandomno(String randomno) {
		this.randomno = randomno;
	}
	/**
	 * 获取：随机码
	 */
	public String getRandomno() {
		return randomno;
	}
	public RandomEntity(String randomno) {
		super();
		this.randomno = randomno;
	}
}
