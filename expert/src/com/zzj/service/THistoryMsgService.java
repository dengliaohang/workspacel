package com.zzj.service;

import com.zzj.entity.THistoryMsg;

public interface THistoryMsgService {
    int deleteByPrimaryKey(Integer cid);

    int insert(THistoryMsg record);

    int insertSelective(THistoryMsg record);

    THistoryMsg selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(THistoryMsg record);

    int updateByPrimaryKey(THistoryMsg record);
}