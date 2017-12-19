package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.WebSetupMapper;
import com.zzj.entity.WebSetup;
import com.zzj.service.WebSetupService;
@Service
public class WebSetupServiceImpl implements WebSetupService {
	
	@Autowired
	private WebSetupMapper webSetupMapper;
	
    public int insert(WebSetup record) throws Exception {
		return webSetupMapper.insert(record);
	}

    public int insertSelective(WebSetup record) throws Exception {
		return webSetupMapper.insertSelective(record);
	}
}