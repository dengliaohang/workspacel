package com.zzj.dao;

import com.zzj.entity.TAccount;

public interface TAccountMapper {
    public int deleteByPrimaryKey(Integer accountid)throws Exception;

    public int insert(TAccount record)throws Exception;

    public int insertSelective(TAccount record)throws Exception;

    public  TAccount selectByPrimaryKey(Integer accountid)throws Exception;

    public int updateByPrimaryKeySelective(TAccount record)throws Exception;

    public int updateByPrimaryKey(TAccount record)throws Exception;
}