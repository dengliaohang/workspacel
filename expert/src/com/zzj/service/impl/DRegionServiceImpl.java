package com.zzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.DRegionMapper;
import com.zzj.entity.DRegion;
import com.zzj.service.DRegionService;
@Service
public class DRegionServiceImpl implements DRegionService {
	
	@Autowired
	private DRegionMapper dRegionMapper;
	
    public int insert(DRegion record) throws Exception {
		return dRegionMapper.insert(record);
	}

    public int insertSelective(DRegion record) throws Exception {
		return dRegionMapper.insertSelective(record);
	}

	@Override
	public List<DRegion> selectAllFirstDRegion() throws Exception{
		return dRegionMapper.selectAllFirstDRegion();
	}

	@Override
	public List<DRegion> selectAllDRegionByFirstCode(String zoneCode,String classId) throws Exception{
		return dRegionMapper.selectAllDRegionByFirstCode(zoneCode,classId);
	}

	@Override
	public List<DRegion> selectAllDRegionBySecondCode(String regionId) throws Exception{
		return dRegionMapper.selectAllDRegionBySecondCode(regionId);
	}
}