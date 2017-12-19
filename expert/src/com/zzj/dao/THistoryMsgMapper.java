package com.zzj.dao;

import com.zzj.entity.THistoryMsg;

public interface THistoryMsgMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(THistoryMsg record);

    int insertSelective(THistoryMsg record);

    THistoryMsg selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(THistoryMsg record);

    int updateByPrimaryKey(THistoryMsg record);
}