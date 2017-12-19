package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TServiceMapper;
import com.zzj.entity.TService;
import com.zzj.service.TServiceService;
@Service
public class TServiceServiceImpl implements TServiceService {
	
	@Autowired
	private TServiceMapper tServiceMapper;
	
	
    public int deleteByPrimaryKey(String id) {
		return tServiceMapper.deleteByPrimaryKey(id);
	}

    public int insert(TService record) {
		return tServiceMapper.insert(record);
	}

    public int insertSelective(TService record) {
		return tServiceMapper.insertSelective(record);
	}

     public TService selectByPrimaryKey(String id) {
		return tServiceMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TService record) {
		return tServiceMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TService record) {
		return tServiceMapper.updateByPrimaryKey(record);
	}
}