package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.FriendsMapper;
import com.zzj.entity.Friends;
import com.zzj.service.FriendsService;
@Service
public class FriendsServiceImpl implements FriendsService{
	
	
	@Autowired
	private FriendsMapper friendsMapper;
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return friendsMapper.deleteByPrimaryKey(id);
	}

    public int insert(Friends record) throws Exception {
		return friendsMapper.insert(record);
	}

    public int insertSelective(Friends record) throws Exception {
		return friendsMapper.insertSelective(record);
	}

    public Friends selectByPrimaryKey(Integer id) throws Exception {
		return friendsMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(Friends record) throws Exception {
		return friendsMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(Friends record) throws Exception {
		return friendsMapper.updateByPrimaryKey(record);
	}
}