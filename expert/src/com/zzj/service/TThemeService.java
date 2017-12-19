package com.zzj.service;

import com.zzj.entity.TTheme;

public interface TThemeService {
    int insert(TTheme record);

    int insertSelective(TTheme record);
}