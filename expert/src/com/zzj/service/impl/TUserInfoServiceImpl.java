package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TUserInfoMapper;
import com.zzj.entity.TUserInfo;
import com.zzj.service.TUserInfoService;
@Service
public class TUserInfoServiceImpl implements TUserInfoService {
	
	@Autowired
	private TUserInfoMapper tUserInfoMapper;
	
    public int deleteByPrimaryKey(String id) {
		return tUserInfoMapper.deleteByPrimaryKey(id);
	}

    public int insert(TUserInfo record) {
		return tUserInfoMapper.insert(record);
	}

    public int insertSelective(TUserInfo record) {
		return tUserInfoMapper.insertSelective(record);
	}

    public TUserInfo selectByPrimaryKey(String id) {
		return tUserInfoMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TUserInfo record) {
		return tUserInfoMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TUserInfo record) {
		return tUserInfoMapper.updateByPrimaryKey(record);
	}
}