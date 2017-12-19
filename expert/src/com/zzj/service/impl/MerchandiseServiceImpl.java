package com.zzj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.MerchandiseMapper;
import com.zzj.entity.Merchandise;
import com.zzj.service.MerchandiseService;
@Service
public class MerchandiseServiceImpl implements MerchandiseService{

	
	@Autowired
	private MerchandiseMapper merchandiseMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Merchandise record) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.insert(record);
	}

	@Override
	public int insertSelective(Merchandise record) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.insertSelective(record);
	}

	@Override
	public Merchandise selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Merchandise record) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(Merchandise record) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(Merchandise record) throws Exception {
		// TODO Auto-generated method stub
		return merchandiseMapper.updateByPrimaryKey(record);
	}

	@Override
	public Map<String, Object> selectMerchandiseByType(int cp, int ls,int merchandiseType)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		cp =  (cp - 1) * ls;
		map.put("list", merchandiseMapper.selectMerchandiseByType(cp, ls, merchandiseType));
		map.put("count", merchandiseMapper.selectAllCount(merchandiseType));
		return map;
	}

	@Override
	public  Map<String, Object> selectMerchandiseByDRegion(int cp, int ls,String regionId,int merchandiseType)
			throws Exception {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = new HashMap<String, Object>();
		cp =  (cp - 1) * ls;
		map.put("list", merchandiseMapper.selectMerchandiseByDRegion(cp, ls, regionId,merchandiseType));
		map.put("count", merchandiseMapper.selectAllCountByDRegion(merchandiseType, regionId));
		return map;
	}

	@Override
	public Map<String, Object> selectMerchandiseByPTitle(int cp, int ls,String ptitleId,int merchandiseType)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		cp =  (cp - 1) * ls;
		map.put("list", merchandiseMapper.selectMerchandiseByPTitle(cp, ls, ptitleId,merchandiseType));
		map.put("count", merchandiseMapper.selectAllCountByPTitle(merchandiseType, ptitleId));
		return map;
	}


	@Override
	public Map<String, Object> selectMerchandiseByDescription(int cp, int ls, int merchandiseType, String description)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		cp =  (cp - 1) * ls;
		map.put("list", merchandiseMapper.selectMerchandiseByDescription(cp, ls,  merchandiseType, description));
		map.put("count", merchandiseMapper.selectAllCountByDescription(merchandiseType, description));
		return map;
	}

}
