package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TMembersMapper;
import com.zzj.entity.TMembers;
import com.zzj.service.TMembersService;
@Service
public class TMembersServiceImpl implements TMembersService {
	
	@Autowired
	private TMembersMapper tMembersMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tMembersMapper.deleteByPrimaryKey(id);
	}

    public int insert(TMembers record) {
		return tMembersMapper.insert(record);
	}

    public int insertSelective(TMembers record) {
		return tMembersMapper.insertSelective(record);
	}

    public TMembers selectByPrimaryKey(Integer id) {
		return tMembersMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TMembers record) {
		return tMembersMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TMembers record) {
		return tMembersMapper.updateByPrimaryKey(record);
	}
}