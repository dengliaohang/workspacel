package com.bbdj8.bus.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbdj8.bus.dao.RandomDao;
import com.bbdj8.bus.entity.RandomEntity;
import com.bbdj8.bus.service.RandomService;



@Service("randomService")
public class RandomServiceImpl implements RandomService {
	@Autowired
	private RandomDao randomDao;
	
	@Override
	public RandomEntity queryObject(String randomno){
		return randomDao.queryObject(randomno);
	}
	
	@Override
	public List<RandomEntity> queryList(Map<String, Object> map){
		return randomDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return randomDao.queryTotal(map);
	}
	
	@Override
	public void save(RandomEntity random){
		randomDao.save(random);
	}
	
	@Override
	public void update(RandomEntity random){
		randomDao.update(random);
	}
	
	@Override
	public void delete(String randomno){
		randomDao.delete(randomno);
	}
	
	@Override
	public void deleteBatch(String[] randomnos){
		randomDao.deleteBatch(randomnos);
	}
	
}
