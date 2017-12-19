package com.zzj.dao;

import com.zzj.entity.TInvestor;

public interface TInvestorMapper {
    int deleteByPrimaryKey(String id);

    int insert(TInvestor record);

    int insertSelective(TInvestor record);

    TInvestor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TInvestor record);

    int updateByPrimaryKey(TInvestor record);
}