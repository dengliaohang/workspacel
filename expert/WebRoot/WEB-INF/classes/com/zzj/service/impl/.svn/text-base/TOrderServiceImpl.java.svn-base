package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TOrderMapper;
import com.zzj.entity.TOrder;
import com.zzj.service.TOrderService;
@Service
public class TOrderServiceImpl implements TOrderService {
	
	@Autowired
	private TOrderMapper tOrderMapper;
	
    public int deleteByPrimaryKey(String id) throws Exception {
		return tOrderMapper.deleteByPrimaryKey(id);
	}

    public int insert(TOrder record) throws Exception {
		return tOrderMapper.insert(record);
	}

    public int insertSelective(TOrder record) throws Exception {
		return tOrderMapper.insertSelective(record);
	}

    public TOrder selectByPrimaryKey(String id) throws Exception {
		return tOrderMapper.selectByPrimaryKey(id);
	}

    public  int updateByPrimaryKeySelective(TOrder record) throws Exception {
		return tOrderMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TOrder record)  throws Exception{
		return tOrderMapper.updateByPrimaryKey(record);
	}
}