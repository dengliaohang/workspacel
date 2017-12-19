package com.zzj.service;

import com.zzj.entity.TFirmInfoCache;

public interface TFirmInfoCacheService {
    int deleteByPrimaryKey(String id);

    int insert(TFirmInfoCache record);

    int insertSelective(TFirmInfoCache record);

    TFirmInfoCache selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TFirmInfoCache record);

    int updateByPrimaryKey(TFirmInfoCache record);
}