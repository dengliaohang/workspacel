package com.zzj.service;

import com.zzj.entity.TExpert;

public interface TExpertService {
    int deleteByPrimaryKey(String id);

    int insert(TExpert record);

    int insertSelective(TExpert record);

    TExpert selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TExpert record);

    int updateByPrimaryKey(TExpert record);
}