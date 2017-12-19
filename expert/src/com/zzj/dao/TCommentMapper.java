package com.zzj.dao;

import com.zzj.entity.TComment;

public interface TCommentMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(TComment record)throws Exception;

    public int insertSelective(TComment record)throws Exception;

    public TComment selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(TComment record)throws Exception;

    public int updateByPrimaryKey(TComment record)throws Exception;
}