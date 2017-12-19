package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TExpertCacheMapper;
import com.zzj.entity.TExpertCache;
import com.zzj.service.TExpertCacheService;
@Service
public class TExpertCacheServiceImpl implements TExpertCacheService {
	
	@Autowired
	private TExpertCacheMapper tExpertCacheMapper;
	
	
    public int deleteByPrimaryKey(String id) {
		return tExpertCacheMapper.deleteByPrimaryKey(id);
	}

    public int insert(TExpertCache record) {
		return tExpertCacheMapper.insert(record);
	}

    public int insertSelective(TExpertCache record) {
		return tExpertCacheMapper.insertSelective(record);
	}

    public TExpertCache selectByPrimaryKey(String id) {
		return tExpertCacheMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TExpertCache record) {
		return tExpertCacheMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TExpertCache record) {
		return tExpertCacheMapper.updateByPrimaryKey(record);
	}
}