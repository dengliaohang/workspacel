package com.zzj.service;

import com.zzj.entity.TNews;

public interface TNewsService {
	public int deleteByPrimaryKey(Integer id) throws Exception;

    public int insert(TNews record) throws Exception;

    public int insertSelective(TNews record) throws Exception;

    public TNews selectByPrimaryKey(Integer id) throws Exception;

    public int updateByPrimaryKeySelective(TNews record) throws Exception;

    public int updateByPrimaryKey(TNews record) throws Exception;
}