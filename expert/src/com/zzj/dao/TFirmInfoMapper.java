package com.zzj.dao;

import com.zzj.entity.TFirmInfo;

public interface TFirmInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFirmInfo record);

    int insertSelective(TFirmInfo record);

    TFirmInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TFirmInfo record);

    int updateByPrimaryKey(TFirmInfo record);
}