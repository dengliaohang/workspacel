package com.zzj.dao;

import com.zzj.entity.TExpertCache;
import com.zzj.entity.TExpertCacheWithBLOBs;

public interface TExpertCacheMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(TExpertCacheWithBLOBs record)throws Exception;

    public int insertSelective(TExpertCacheWithBLOBs record)throws Exception;

    public TExpertCacheWithBLOBs selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(TExpertCacheWithBLOBs record)throws Exception;

    public int updateByPrimaryKeyWithBLOBs(TExpertCacheWithBLOBs record)throws Exception;

    public int updateByPrimaryKey(TExpertCache record)throws Exception;
}