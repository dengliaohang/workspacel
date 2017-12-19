package com.zzj.dao;

import com.zzj.entity.TTeamApply;

public interface TTeamApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TTeamApply record);

    int insertSelective(TTeamApply record);

    TTeamApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TTeamApply record);

    int updateByPrimaryKey(TTeamApply record);
}