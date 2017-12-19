package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.PayLogMapper;
import com.zzj.entity.PayLog;
import com.zzj.service.PayLogService;
@Service
public class PayLogServiceImpl  implements PayLogService {
	
	@Autowired
	private PayLogMapper payLogMapper;
	
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return payLogMapper.deleteByPrimaryKey(id);
	}

    public int insert(PayLog record) throws Exception {
		return payLogMapper.insert(record);
	}

    public int insertSelective(PayLog record) throws Exception {
		return payLogMapper.insertSelective(record);
	}

    public PayLog selectByPrimaryKey(Integer id) throws Exception {
		return payLogMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(PayLog record) throws Exception {
		return payLogMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(PayLog record) throws Exception {
		return payLogMapper.updateByPrimaryKey(record);
	}
}