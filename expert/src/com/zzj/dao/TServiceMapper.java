package com.zzj.dao;

import com.zzj.entity.TService;

public interface TServiceMapper {
    int deleteByPrimaryKey(String id);

    int insert(TService record);

    int insertSelective(TService record);

    TService selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TService record);

    int updateByPrimaryKey(TService record);
}