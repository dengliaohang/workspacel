package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TSystemMsgMapper;
import com.zzj.entity.TSystemMsg;
import com.zzj.service.TSystemMsgService;
@Service
public class TSystemMsgServiceImpl implements TSystemMsgService {
	
	@Autowired
	private TSystemMsgMapper tSystemMsgMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tSystemMsgMapper.deleteByPrimaryKey(id);
	}

    public int insert(TSystemMsg record) {
		return tSystemMsgMapper.insert(record);
	}

    public int insertSelective(TSystemMsg record) {
		return tSystemMsgMapper.insertSelective(record);
	}

    public TSystemMsg selectByPrimaryKey(Integer id) {
		return tSystemMsgMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TSystemMsg record) {
		return tSystemMsgMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TSystemMsg record) {
		return tSystemMsgMapper.updateByPrimaryKey(record);
	}
}