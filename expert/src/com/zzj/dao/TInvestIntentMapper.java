package com.zzj.dao;

import com.zzj.entity.TInvestIntent;

public interface TInvestIntentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TInvestIntent record);

    int insertSelective(TInvestIntent record);

    TInvestIntent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TInvestIntent record);

    int updateByPrimaryKey(TInvestIntent record);
}