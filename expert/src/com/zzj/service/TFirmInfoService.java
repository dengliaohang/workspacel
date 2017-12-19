package com.zzj.service;

import com.zzj.entity.TFirmInfo;

public interface TFirmInfoService {
    int deleteByPrimaryKey(String id);

    int insert(TFirmInfo record);

    int insertSelective(TFirmInfo record);

    TFirmInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TFirmInfo record);

    int updateByPrimaryKey(TFirmInfo record);
}