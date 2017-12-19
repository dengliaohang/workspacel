package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TInvestorMapper;
import com.zzj.entity.TInvestor;
import com.zzj.service.TInvestorService;
@Service
public class TInvestorServiceImpl implements TInvestorService{
	
	@Autowired
	private TInvestorMapper tInvestorMapper;
    public int deleteByPrimaryKey(String id) {
		return tInvestorMapper.deleteByPrimaryKey(id);
	}

    public int insert(TInvestor record) {
		return tInvestorMapper.insert(record);
	}

    public int insertSelective(TInvestor record) {
		return tInvestorMapper.insertSelective(record);
	}

    public TInvestor selectByPrimaryKey(String id) {
		return tInvestorMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TInvestor record) {
		return tInvestorMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TInvestor record) {
		return tInvestorMapper.updateByPrimaryKey(record);
	}
}