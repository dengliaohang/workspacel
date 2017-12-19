package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TFeedBackMapper;
import com.zzj.entity.TFeedBack;
import com.zzj.service.TFeedBackService;
@Service
public class TFeedBackServiceImpl implements TFeedBackService {
	
	@Autowired
	private TFeedBackMapper tFeedBackMapper;
	
	
	
    public int deleteByPrimaryKey(Integer id) {
		return tFeedBackMapper.deleteByPrimaryKey(id);
	}

    public int insert(TFeedBack record) {
		return tFeedBackMapper.insert(record);
	}

    public int insertSelective(TFeedBack record) {
		return tFeedBackMapper.insertSelective(record);
	}

    public TFeedBack selectByPrimaryKey(Integer id) {
		return tFeedBackMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TFeedBack record) {
		return tFeedBackMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TFeedBack record) {
		return tFeedBackMapper.updateByPrimaryKey(record);
	}
}