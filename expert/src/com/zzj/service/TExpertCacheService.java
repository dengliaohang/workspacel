package com.zzj.service;

import com.zzj.entity.TExpertCache;

public interface TExpertCacheService {
	 public int deleteByPrimaryKey(String id) throws Exception;

    public int insert(TExpertCache record) throws Exception;

    public int insertSelective(TExpertCache record) throws Exception;

    public TExpertCache selectByPrimaryKey(String id) throws Exception;

    public int updateByPrimaryKeySelective(TExpertCache record) throws Exception;

    public int updateByPrimaryKey(TExpertCache record) throws Exception;
}