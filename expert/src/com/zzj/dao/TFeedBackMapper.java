package com.zzj.dao;

import com.zzj.entity.TFeedBack;

public interface TFeedBackMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(TFeedBack record)throws Exception;

    public int insertSelective(TFeedBack record)throws Exception;

    public TFeedBack selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(TFeedBack record)throws Exception;

    public int updateByPrimaryKeyWithBLOBs(TFeedBack record)throws Exception;

    public int updateByPrimaryKey(TFeedBack record)throws Exception;
}