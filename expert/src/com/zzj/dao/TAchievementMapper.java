package com.zzj.dao;

import com.zzj.entity.TAchievement;

public interface TAchievementMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAchievement record);

    int insertSelective(TAchievement record);

    TAchievement selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAchievement record);

    int updateByPrimaryKey(TAchievement record);
}