package com.zzj.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TPersonMapper;
import com.zzj.entity.TPerson;
import com.zzj.service.TPersonService;
/**
 * 
 * @author wangyadi
 *
 */
@Service
public class TPersonServiceImpl implements TPersonService {

	@Autowired
	private TPersonMapper personMapper;
	@Override
	public int deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TPerson record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TPerson selectById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TPerson record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 分页查询全部专家
	 * @param isExpert  1:专家，0：普通用户
	 */
	@Override
	public Map<String, Object> queryPersonsAll(int cp, int ls, int isExpert)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		cp =  (cp - 1) * ls;
		map.put("list", personMapper.selectAllByIsExpert(cp, ls, isExpert));
		map.put("count", personMapper.selectAllByIsExpertCount(isExpert));
		return map;
	}

	@Override
	public Map<String, Object> queryPersonsByRegion(int cp, int ls,
			String region, int isExpert) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryPersonsByTitle(int cp, int ls, int title,
			int isExpert) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 查询全部人员
	 * 
	 */
	@Override
	public Map<String, Object> queryPersonAll(int cp, int ls) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		cp =  (cp - 1) * ls;
		map.put("list", personMapper.selectAll(cp, ls));
		map.put("count", personMapper.selectAllCount());
		return map;
	}

}
