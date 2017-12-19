package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TThemeMapper;
import com.zzj.entity.TTheme;
import com.zzj.service.TThemeService;
@Service
public class TThemeServiceImpl implements TThemeService {
	
	@Autowired
	private TThemeMapper tThemeMapper;
	
    public int insert(TTheme record) {
		return tThemeMapper.insert(record);
	}

    public int insertSelective(TTheme record) {
		return tThemeMapper.insertSelective(record);
	}
}