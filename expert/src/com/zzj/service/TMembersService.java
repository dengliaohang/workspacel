package com.zzj.service;

import com.zzj.entity.TMembers;

public interface TMembersService {
    int deleteByPrimaryKey(Integer id);

    int insert(TMembers record);

    int insertSelective(TMembers record);

    TMembers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMembers record);

    int updateByPrimaryKey(TMembers record);
}