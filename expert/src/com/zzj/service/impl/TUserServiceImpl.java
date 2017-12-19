package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TUserMapper;
import com.zzj.entity.TUser;
import com.zzj.service.TUserService;
@Service
public class TUserServiceImpl implements TUserService {
	
	@Autowired
	private TUserMapper tUserMapper;
	
    public int deleteByPrimaryKey(String id) {
		return tUserMapper.deleteByPrimaryKey(id);
	}

    public int insert(TUser record) {
		return tUserMapper.insert(record);
	}

    public int insertSelective(TUser record) {
		return tUserMapper.insertSelective(record);
	}

    public TUser selectByPrimaryKey(String id) {
		return tUserMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TUser record) {
		return tUserMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TUser record) {
		return tUserMapper.updateByPrimaryKey(record);
	}
}