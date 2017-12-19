package com.zzj.service;

import com.zzj.entity.TAccountRecord;

public interface TAccountRecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(TAccountRecord record);

    int insertSelective(TAccountRecord record);

    TAccountRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAccountRecord record);

    int updateByPrimaryKey(TAccountRecord record);
}