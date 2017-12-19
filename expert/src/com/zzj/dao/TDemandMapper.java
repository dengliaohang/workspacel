package com.zzj.dao;

import com.zzj.entity.TDemand;

public interface TDemandMapper {
    int deleteByPrimaryKey(String id);

    int insert(TDemand record);

    int insertSelective(TDemand record);

    TDemand selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TDemand record);

    int updateByPrimaryKey(TDemand record);
}