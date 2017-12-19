package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TTeamRelaMapper;
import com.zzj.entity.TTeamRela;
import com.zzj.service.TTeamRelaService;
@Service
public class TTeamRelaServiceImpl implements TTeamRelaService {
	
	@Autowired
	private TTeamRelaMapper tTeamRelaMapper;
	
	
    public int insert(TTeamRela record) {
		return tTeamRelaMapper.insert(record);
	}

    public int insertSelective(TTeamRela record) {
		return tTeamRelaMapper.insertSelective(record);
	}
}