package com.bbdj8.bus.service;

import java.util.List;
import java.util.Map;

import com.bbdj8.bus.entity.RandomEntity;

/**
 * 随机码表
 * 
 * @author liwenjun
 * @email 18623682292@163.com
 * @date 2017-03-04 11:28:13
 */
public interface RandomService {
	
	RandomEntity queryObject(String randomno);
	
	List<RandomEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RandomEntity random);
	
	void update(RandomEntity random);
	
	void delete(String randomno);
	
	void deleteBatch(String[] randomnos);
}
