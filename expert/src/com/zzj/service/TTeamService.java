package com.zzj.service;

import com.zzj.entity.TTeam;

public interface TTeamService {
    int deleteByPrimaryKey(String id);

    int insert(TTeam record);

    int insertSelective(TTeam record);

    TTeam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TTeam record);

    int updateByPrimaryKey(TTeam record);
}