package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TConcernMapper;
import com.zzj.entity.TConcern;
import com.zzj.service.TConcernService;
@Service
public class TConcernServiceImpl implements TConcernService {
	
	@Autowired
	private TConcernMapper tConcernMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tConcernMapper.deleteByPrimaryKey(id);
	}

    public int insert(TConcern record) {
		return tConcernMapper.insert(record);
	}

    public int insertSelective(TConcern record) {
		return tConcernMapper.insertSelective(record);
	}

    public TConcern selectByPrimaryKey(Integer id) {
		return tConcernMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TConcern record) {
		return tConcernMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TConcern record) {
		return tConcernMapper.updateByPrimaryKey(record);
	}
}