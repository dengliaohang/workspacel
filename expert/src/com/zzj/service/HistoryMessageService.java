package com.zzj.service;

import com.zzj.entity.HistoryMessage;

public interface HistoryMessageService {
    public int deleteByPrimaryKey(Integer id) throws Exception;

    public int insert(HistoryMessage record) throws Exception;

    public int insertSelective(HistoryMessage record) throws Exception;

    public HistoryMessage selectByPrimaryKey(Integer id) throws Exception;

    public int updateByPrimaryKeySelective(HistoryMessage record) throws Exception;

    public int updateByPrimaryKey(HistoryMessage record) throws Exception;
}