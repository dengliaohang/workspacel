package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TNewsMapper;
import com.zzj.entity.TNews;
import com.zzj.service.TNewsService;
@Service
public class TNewsServiceImpl  implements TNewsService {
	
	@Autowired
	private TNewsMapper tNewsMapper;
	
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return tNewsMapper.deleteByPrimaryKey(id);
	}

    public int insert(TNews record) throws Exception {
		return tNewsMapper.insert(record);
	}

    public int insertSelective(TNews record) throws Exception {
		return tNewsMapper.insertSelective(record);
	}

    public TNews selectByPrimaryKey(Integer id) throws Exception {
		return tNewsMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TNews record) throws Exception {
		return tNewsMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TNews record) throws Exception {
		return tNewsMapper.updateByPrimaryKey(record);
	}
}