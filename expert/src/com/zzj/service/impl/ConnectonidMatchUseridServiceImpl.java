package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.ConnectonidMatchUseridMapper;
import com.zzj.entity.ConnectonidMatchUserid;
import com.zzj.service.ConnectonidMatchUseridService;

@Service
public class ConnectonidMatchUseridServiceImpl implements ConnectonidMatchUseridService{
	@Autowired
	private ConnectonidMatchUseridMapper  connectonidMatchUseridMapper;
    public int insert(ConnectonidMatchUserid record) {
    	System.out.println("1");
		return connectonidMatchUseridMapper.insert(record);
	}

    public int insertSelective(ConnectonidMatchUserid record) {
		return connectonidMatchUseridMapper.insertSelective(record);
	}
}