package com.zzj.service;

import com.zzj.entity.TService;

public interface TServiceService {
    int deleteByPrimaryKey(String id);

    int insert(TService record);

    int insertSelective(TService record);

    TService selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TService record);

    int updateByPrimaryKey(TService record);
}