package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TAchievementMapper;
import com.zzj.entity.TAchievement;
import com.zzj.service.TAchievementService;
@Service
public class TAchievementServiceImpl implements TAchievementService {
	
	@Autowired
	private TAchievementMapper tAchievementMapper;
	
    public int deleteByPrimaryKey(String id) {
		return tAchievementMapper.deleteByPrimaryKey(id);
	}

    public int insert(TAchievement record) {
		return tAchievementMapper.insert(record);
	}

    public int insertSelective(TAchievement record) {
		return tAchievementMapper.insertSelective(record);
	}

    public TAchievement selectByPrimaryKey(String id) {
		return tAchievementMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TAchievement record) {
		return tAchievementMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TAchievement record) {
		return tAchievementMapper.updateByPrimaryKey(record);
	}
}