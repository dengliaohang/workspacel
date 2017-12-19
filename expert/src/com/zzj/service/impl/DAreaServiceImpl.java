package com.zzj.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.DAreaMapper;
import com.zzj.entity.DArea;
import com.zzj.entity.DRegion;
import com.zzj.service.DAreaService;
@Service
public class DAreaServiceImpl implements DAreaService{
	@Autowired
	private DAreaMapper dAreaMapper;
	
    public int deleteByPrimaryKey(String code) throws Exception {
		return dAreaMapper.deleteByPrimaryKey(code);
	}

    public int insert(DArea record) throws Exception {
		return dAreaMapper.insert(record);
	}

    public int insertSelective(DArea record) throws Exception{
		return dAreaMapper.insertSelective(record);
	}

    public DArea selectByPrimaryKey(String code) throws Exception{
		return dAreaMapper.selectByPrimaryKey(code);
	}

    public int updateByPrimaryKeySelective(DArea record) throws Exception{
		return dAreaMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(DArea record)throws Exception {
		return dAreaMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<DArea> selectAllFirstDArea(String classId) throws Exception{
		return dAreaMapper.selectAllFirstDArea(classId);
	}

	@Override
	public List<DArea> selectAllDAreaByFirstCode(String firstCode) throws Exception{
		return dAreaMapper.selectAllDAreaByFirstCode(firstCode);
	}
}