
package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TConsultMapper;
import com.zzj.entity.TConsult;
import com.zzj.service.TConsultService;
@Service
public class TConsultServiceImpl implements TConsultService {
	
	@Autowired
	private TConsultMapper tConsultMapper;
	
	
    public int deleteByPrimaryKey(Integer id) throws Exception {
		return tConsultMapper.deleteByPrimaryKey(id);
	}

    public int insert(TConsult record) throws Exception {
		return tConsultMapper.insert(record);
	}

    
    public int insertSelective(TConsult record) throws Exception {
		return tConsultMapper.insertSelective(record);
	}

    public TConsult selectByPrimaryKey(Integer id) throws Exception {
		return tConsultMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TConsult record) throws Exception {
		return tConsultMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TConsult record) throws Exception {
		return tConsultMapper.updateByPrimaryKey(record);
	}
}