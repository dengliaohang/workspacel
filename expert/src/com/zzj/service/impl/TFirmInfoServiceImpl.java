package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TFirmInfoMapper;
import com.zzj.entity.TFirmInfo;
import com.zzj.service.TFirmInfoService;
@Service
public class TFirmInfoServiceImpl implements TFirmInfoService {
	
	@Autowired
	private TFirmInfoMapper tFirmInfoMapper;
	
	
    public int deleteByPrimaryKey(String id) {
		return tFirmInfoMapper.deleteByPrimaryKey(id);
	}

    public int insert(TFirmInfo record) {
		return tFirmInfoMapper.insert(record);
	}

    public int insertSelective(TFirmInfo record) {
		return tFirmInfoMapper.insertSelective(record);
	}

    public TFirmInfo selectByPrimaryKey(String id) {
		return tFirmInfoMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TFirmInfo record) {
		return tFirmInfoMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TFirmInfo record) {
		return tFirmInfoMapper.updateByPrimaryKey(record);
	}
}