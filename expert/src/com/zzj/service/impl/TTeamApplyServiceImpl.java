package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TTeamApplyMapper;
import com.zzj.entity.TTeamApply;
import com.zzj.service.TTeamApplyService;
@Service
public class TTeamApplyServiceImpl implements TTeamApplyService {
	
	@Autowired
	private TTeamApplyMapper tTeamApplyMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tTeamApplyMapper.deleteByPrimaryKey(id);
	}

    public int insert(TTeamApply record) {
		return tTeamApplyMapper.insert(record);
	}

    public int insertSelective(TTeamApply record) {
		return tTeamApplyMapper.insertSelective(record);
	}

    public TTeamApply selectByPrimaryKey(Integer id) {
		return tTeamApplyMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TTeamApply record) {
		return tTeamApplyMapper.updateByPrimaryKeySelective(record);
	}

    public  int updateByPrimaryKey(TTeamApply record) {
		return tTeamApplyMapper.updateByPrimaryKey(record);
	}
}