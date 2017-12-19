package com.zzj.service;

import com.zzj.entity.WebSetup;

public interface WebSetupService {
	public int insert(WebSetup record) throws Exception;

	public int insertSelective(WebSetup record) throws Exception;
}