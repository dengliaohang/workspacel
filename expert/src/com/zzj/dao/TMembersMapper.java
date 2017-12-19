package com.zzj.dao;

import com.zzj.entity.TMembers;

public interface TMembersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMembers record);

    int insertSelective(TMembers record);

    TMembers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMembers record);

    int updateByPrimaryKey(TMembers record);
}