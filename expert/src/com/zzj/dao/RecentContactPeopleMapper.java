package com.zzj.dao;

import com.zzj.entity.Recentcontactpeople;

public interface RecentcontactpeopleMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(Recentcontactpeople record)throws Exception;

    public int insertSelective(Recentcontactpeople record)throws Exception;

    public  Recentcontactpeople selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(Recentcontactpeople record)throws Exception;

    public int updateByPrimaryKey(Recentcontactpeople record)throws Exception;
}