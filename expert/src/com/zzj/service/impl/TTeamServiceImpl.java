package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TTeamMapper;
import com.zzj.entity.TTeam;
import com.zzj.service.TTeamService;
@Service
public class TTeamServiceImpl implements TTeamService  {
	
	@Autowired
	private TTeamMapper tTeamMapper;
	
    public int deleteByPrimaryKey(String id) {
		return tTeamMapper.deleteByPrimaryKey(id);
	}

    public int insert(TTeam record) {
		return tTeamMapper.insert(record);
	}

    public int insertSelective(TTeam record) {
		return tTeamMapper.insertSelective(record);
	}

    public TTeam selectByPrimaryKey(String id) {
		return tTeamMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TTeam record) {
		return tTeamMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TTeam record) {
		return tTeamMapper.updateByPrimaryKey(record);
	}
}