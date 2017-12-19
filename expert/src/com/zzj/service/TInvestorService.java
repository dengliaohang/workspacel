package com.zzj.service;

import com.zzj.entity.TInvestor;

public interface TInvestorService {
    int deleteByPrimaryKey(String id);

    int insert(TInvestor record);

    int insertSelective(TInvestor record);

    TInvestor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TInvestor record);

    int updateByPrimaryKey(TInvestor record);
}