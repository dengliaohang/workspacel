package com.zzj.dao;

import com.zzj.entity.TMeeting;

public interface TMeetingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMeeting record);

    int insertSelective(TMeeting record);

    TMeeting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMeeting record);

    int updateByPrimaryKey(TMeeting record);
}