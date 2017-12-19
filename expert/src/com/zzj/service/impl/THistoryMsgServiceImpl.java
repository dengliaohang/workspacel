package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.THistoryMsgMapper;
import com.zzj.entity.THistoryMsg;
import com.zzj.service.THistoryMsgService;
@Service
public class THistoryMsgServiceImpl implements THistoryMsgService {
	
	@Autowired
	private THistoryMsgMapper tHistoryMsgMapper;
    public int deleteByPrimaryKey(Integer cid) {
		return tHistoryMsgMapper.deleteByPrimaryKey(cid);
	}

    public int insert(THistoryMsg record) {
		return tHistoryMsgMapper.insert(record);
	}

    public int insertSelective(THistoryMsg record) {
		return tHistoryMsgMapper.insertSelective(record);
	}

    public THistoryMsg selectByPrimaryKey(Integer cid) {
		return tHistoryMsgMapper.selectByPrimaryKey(cid);
	}

    public int updateByPrimaryKeySelective(THistoryMsg record) {
		return tHistoryMsgMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(THistoryMsg record) {
		return tHistoryMsgMapper.updateByPrimaryKey(record);
	}
}