package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TDemandMapper;
import com.zzj.entity.TDemand;
import com.zzj.service.TDemandService;
@Service
public class TDemandServiceImpl implements TDemandService {
	
	@Autowired
	private TDemandMapper tDemandMapper;
	
	
    public int deleteByPrimaryKey(String id) {
		return tDemandMapper.deleteByPrimaryKey(id);
	}

    public int insert(TDemand record) {
		return tDemandMapper.insert(record);
	}

    public int insertSelective(TDemand record) {
		return tDemandMapper.insertSelective(record);
	}

    public TDemand selectByPrimaryKey(String id) {
		return tDemandMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TDemand record) {
		return tDemandMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TDemand record) {
		return tDemandMapper.updateByPrimaryKey(record);
	}
}