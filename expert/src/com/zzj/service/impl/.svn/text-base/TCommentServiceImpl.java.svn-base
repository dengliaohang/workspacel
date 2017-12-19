package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TCommentMapper;
import com.zzj.entity.TComment;
import com.zzj.service.TCommentService;
@Service
public class TCommentServiceImpl implements TCommentService{
	
	@Autowired
	private TCommentMapper tCommentMapper;
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return tCommentMapper.deleteByPrimaryKey(id);
	}

    public int insert(TComment record) throws Exception {
		return tCommentMapper.insert(record);
	}

    public int insertSelective(TComment record) throws Exception {
		return tCommentMapper.insertSelective(record);
	}

    public TComment selectByPrimaryKey(Integer id) throws Exception {
		return tCommentMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TComment record) throws Exception {
		return tCommentMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TComment record) throws Exception {
		return tCommentMapper.updateByPrimaryKey(record);
	}
}