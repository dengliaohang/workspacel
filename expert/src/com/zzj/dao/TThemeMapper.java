package com.zzj.dao;

import com.zzj.entity.TTheme;

public interface TThemeMapper {
    int insert(TTheme record);

    int insertSelective(TTheme record);
}