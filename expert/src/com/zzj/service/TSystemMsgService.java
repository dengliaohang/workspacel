package com.zzj.service;

import com.zzj.entity.TSystemMsg;

public interface TSystemMsgService {
    int deleteByPrimaryKey(Integer id);

    int insert(TSystemMsg record);

    int insertSelective(TSystemMsg record);

    TSystemMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSystemMsg record);

    int updateByPrimaryKey(TSystemMsg record);
}