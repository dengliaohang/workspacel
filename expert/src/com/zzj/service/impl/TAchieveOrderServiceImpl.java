package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TAchieveOrderMapper;
import com.zzj.entity.TAchieveOrder;
@Service
public class TAchieveOrderServiceImpl implements com.zzj.service.TAchieveOrderService{
	
	@Autowired
	private TAchieveOrderMapper tAchieveOrderMapper;
	
	
    public int insert(TAchieveOrder record) {
		return tAchieveOrderMapper.insert(record);
	}

    public int insertSelective(TAchieveOrder record) {
		return tAchieveOrderMapper.insertSelective(record);
	}
}