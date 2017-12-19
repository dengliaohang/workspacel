package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TFirmInfoCacheMapper;
import com.zzj.entity.TFirmInfoCache;
import com.zzj.service.TFirmInfoCacheService;
@Service
public class TFirmInfoCacheServiceImpl  implements TFirmInfoCacheService{
	
	@Autowired
	private TFirmInfoCacheMapper tFirmInfoCacheMapper;
	
	
    public int deleteByPrimaryKey(String id) {
		return tFirmInfoCacheMapper.deleteByPrimaryKey(id);
	}

    public int insert(TFirmInfoCache record) {
		return tFirmInfoCacheMapper.insert(record);
	}

    public int insertSelective(TFirmInfoCache record) {
		return tFirmInfoCacheMapper.insertSelective(record);
	}

    public TFirmInfoCache selectByPrimaryKey(String id) {
		return tFirmInfoCacheMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TFirmInfoCache record) {
		return tFirmInfoCacheMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TFirmInfoCache record) {
		return tFirmInfoCacheMapper.updateByPrimaryKey(record);
	}
}