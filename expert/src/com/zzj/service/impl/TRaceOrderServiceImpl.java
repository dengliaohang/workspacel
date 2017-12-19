package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TRaceOrderMapper;
import com.zzj.entity.TRaceOrder;
import com.zzj.entity.TRaceOrderKey;
import com.zzj.service.TRaceOrderService;
@Service
public class TRaceOrderServiceImpl implements TRaceOrderService {
	
	@Autowired
	private TRaceOrderMapper tRaceOrderMapper;
	
    public int deleteByPrimaryKey(TRaceOrderKey key) {
		return tRaceOrderMapper.deleteByPrimaryKey(key);
	}

    public int insert(TRaceOrder record) {
		return tRaceOrderMapper.insert(record);
	}

    public int insertSelective(TRaceOrder record) {
		return tRaceOrderMapper.insertSelective(record);
	}

    public TRaceOrder selectByPrimaryKey(TRaceOrderKey key) {
		return tRaceOrderMapper.selectByPrimaryKey(key);
	}

    public int updateByPrimaryKeySelective(TRaceOrder record) {
		return tRaceOrderMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TRaceOrder record) {
		return tRaceOrderMapper.updateByPrimaryKey(record);
	}
}