package com.zzj.dao;

import com.zzj.entity.TNews;

public interface TNewsMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(TNews record)throws Exception;

    public int insertSelective(TNews record)throws Exception;

    public TNews selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(TNews record)throws Exception;

    public int updateByPrimaryKeyWithBLOBs(TNews record)throws Exception;

    public int updateByPrimaryKey(TNews record)throws Exception;
}