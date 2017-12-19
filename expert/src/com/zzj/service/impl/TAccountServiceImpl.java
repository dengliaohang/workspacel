package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TAccountMapper;
import com.zzj.entity.TAccount;
import com.zzj.service.TAccountService;
@Service
public class TAccountServiceImpl implements TAccountService {
	
	@Autowired
	private TAccountMapper tAccountMapper;
	
    public int deleteByPrimaryKey(String accountid) {
		return tAccountMapper.deleteByPrimaryKey(accountid);
	}

    public int insert(TAccount record) {
		return tAccountMapper.insert(record);
	}

    public int insertSelective(TAccount record) {
		return tAccountMapper.insertSelective(record);
	}

    public TAccount selectByPrimaryKey(String accountid) {
		return tAccountMapper.selectByPrimaryKey(accountid);
	}

    public int updateByPrimaryKeySelective(TAccount record) {
		return tAccountMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TAccount record) {
		return tAccountMapper.updateByPrimaryKey(record);
	}
}