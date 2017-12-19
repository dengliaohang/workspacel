package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.HistoryMessageMapper;
import com.zzj.entity.HistoryMessage;
import com.zzj.service.HistoryMessageService;
@Service
public class HistoryMessageServiceImpl implements HistoryMessageService {
	
	@Autowired
	private HistoryMessageMapper historyMessageMapper;
	
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return historyMessageMapper.deleteByPrimaryKey(id);
	}

    public int insert(HistoryMessage record) throws Exception {
		return historyMessageMapper.insert(record);
	}

    public int insertSelective(HistoryMessage record) throws Exception {
		return historyMessageMapper.insertSelective(record);
	}

    public HistoryMessage selectByPrimaryKey(Integer id) throws Exception {
		return historyMessageMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(HistoryMessage record) throws Exception {
		return historyMessageMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(HistoryMessage record) throws Exception {
		return historyMessageMapper.updateByPrimaryKey(record);
	}
}