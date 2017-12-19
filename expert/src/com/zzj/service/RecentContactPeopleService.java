package com.zzj.service;

import com.zzj.entity.RecentContactPeople;

public interface RecentContactPeopleService {
    int deleteByPrimaryKey(Integer id);

    int insert(RecentContactPeople record);

    int insertSelective(RecentContactPeople record);

    RecentContactPeople selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecentContactPeople record);

    int updateByPrimaryKey(RecentContactPeople record);
}