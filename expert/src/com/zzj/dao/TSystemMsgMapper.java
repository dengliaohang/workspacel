package com.zzj.dao;

import com.zzj.entity.TSystemMsg;

public interface TSystemMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSystemMsg record);

    int insertSelective(TSystemMsg record);

    TSystemMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSystemMsg record);

    int updateByPrimaryKey(TSystemMsg record);
}