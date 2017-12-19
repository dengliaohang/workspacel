package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TMessageMapper;
import com.zzj.entity.TMessage;
import com.zzj.service.TMessageService;
@Service
public class TMessageServiceImpl implements TMessageService{
	@Autowired
	private TMessageMapper tMessageMapper;
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return tMessageMapper.deleteByPrimaryKey(id);
	}

    public int insert(TMessage record) throws Exception {
		return tMessageMapper.insert(record);
	}

    public int insertSelective(TMessage record) throws Exception {
		return tMessageMapper.insertSelective(record);
	}

    public TMessage selectByPrimaryKey(Integer id) throws Exception {
		return tMessageMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TMessage record) throws Exception {
		return tMessageMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TMessage record) throws Exception {
		return tMessageMapper.updateByPrimaryKey(record);
	}
}