package com.zzj.dao;

import com.zzj.entity.TConcern;

public interface TConcernMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TConcern record);

    int insertSelective(TConcern record);

    TConcern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TConcern record);

    int updateByPrimaryKey(TConcern record);
}