package com.zzj.service;

import com.zzj.entity.TMeeting;

public interface TMeetingService {
    int deleteByPrimaryKey(Integer id);

    int insert(TMeeting record);

    int insertSelective(TMeeting record);

    TMeeting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMeeting record);

    int updateByPrimaryKey(TMeeting record);
}