package com.zzj.dao;

import com.zzj.entity.TFirmInfoCache;

public interface TFirmInfoCacheMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFirmInfoCache record);

    int insertSelective(TFirmInfoCache record);

    TFirmInfoCache selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TFirmInfoCache record);

    int updateByPrimaryKey(TFirmInfoCache record);
}