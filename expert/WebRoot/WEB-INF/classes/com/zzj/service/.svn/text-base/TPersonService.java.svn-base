package com.zzj.service;

import java.util.Map;

import com.zzj.entity.TPerson;


public interface TPersonService {

	public int deleteById(String id) throws Exception;

	public int insert(TPerson record) throws Exception;

	public TPerson selectById(String id) throws Exception;

	public int update(TPerson record) throws Exception;

	//分页查询全部 人员
	public Map<String, Object> queryPersonAll(int cp, int ls) throws Exception;
	
	//分页查询全部专家  根据isExpert为1 
	public Map<String, Object> queryPersonsAll(int cp, int ls,int isExpert) throws Exception;
	//根据地区分页查询专家
	public Map<String, Object> queryPersonsByRegion(int cp, int ls,String region,int isExpert) throws Exception;
	//根据职称分页查询专家
	public Map<String, Object> queryPersonsByTitle(int cp, int ls,int title,int isExpert) throws Exception;
	
}
