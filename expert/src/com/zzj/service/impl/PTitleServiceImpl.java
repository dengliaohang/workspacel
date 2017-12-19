package com.zzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.PTitleMapper;
import com.zzj.entity.PTitle;
import com.zzj.service.PTitleService;
@Service
public class PTitleServiceImpl implements PTitleService{

	
	@Autowired
	private PTitleMapper pTitleMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return pTitleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(PTitle record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(PTitle record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PTitle selectByPrimaryKey(int id) throws Exception {
		// TODO Auto-generated method stub
		return pTitleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(PTitle record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(PTitle record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PTitle> selectPTitleByLevel(String level) throws Exception {
		
		return pTitleMapper.selectPTitleByLevel(level);
	}

	@Override
	public List<PTitle> selectPTitleByCode(String level,String parentCode) throws Exception {
		
		
		
		return pTitleMapper.selectPTitleByCode(level, parentCode);
	}
	
	
	
	

}
