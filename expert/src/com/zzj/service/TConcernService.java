package com.zzj.service;

import com.zzj.entity.TConcern;

public interface TConcernService {
    int deleteByPrimaryKey(Integer id);

    int insert(TConcern record);

    int insertSelective(TConcern record);

    TConcern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TConcern record);

    int updateByPrimaryKey(TConcern record);
}