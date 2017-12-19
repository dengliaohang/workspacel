package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TInvestIntentMapper;
import com.zzj.entity.TInvestIntent;
import com.zzj.service.TInvestIntentService;
@Service
public class TInvestIntentServiceImpl implements TInvestIntentService {
	
	@Autowired
	private TInvestIntentMapper tInvestIntentMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tInvestIntentMapper.deleteByPrimaryKey(id);
	}

    public int insert(TInvestIntent record) {
		return tInvestIntentMapper.insert(record);
	}

    public int insertSelective(TInvestIntent record) {
		return tInvestIntentMapper.insertSelective(record);
	}

    public TInvestIntent selectByPrimaryKey(Integer id) {
		return tInvestIntentMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TInvestIntent record) {
		return tInvestIntentMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TInvestIntent record) {
		return tInvestIntentMapper.updateByPrimaryKey(record);
	}
}