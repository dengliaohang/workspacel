package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TExpertMapper;
import com.zzj.entity.TExpert;
import com.zzj.service.TExpertService;
@Service
public class TExpertServiceImpl implements TExpertService {
	
	@Autowired
	private TExpertMapper tExpertMapper;
	
	
    public int deleteByPrimaryKey(String id) {
		return tExpertMapper.deleteByPrimaryKey(id);
	}

    public int insert(TExpert record) {
		return tExpertMapper.insert(record);
	}

    public int insertSelective(TExpert record) {
		return tExpertMapper.insertSelective(record);
	}

    public TExpert selectByPrimaryKey(String id) {
		return tExpertMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TExpert record) {
		return tExpertMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TExpert record) {
		return tExpertMapper.updateByPrimaryKey(record);
	}
}