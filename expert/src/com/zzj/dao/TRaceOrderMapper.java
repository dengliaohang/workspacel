package com.zzj.dao;

import com.zzj.entity.TRaceOrder;
import com.zzj.entity.TRaceOrderKey;

public interface TRaceOrderMapper {
    int deleteByPrimaryKey(TRaceOrderKey key);

    int insert(TRaceOrder record);

    int insertSelective(TRaceOrder record);

    TRaceOrder selectByPrimaryKey(TRaceOrderKey key);

    int updateByPrimaryKeySelective(TRaceOrder record);

    int updateByPrimaryKey(TRaceOrder record);
}