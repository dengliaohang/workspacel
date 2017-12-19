package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.RecentContactPeopleMapper;
import com.zzj.entity.RecentContactPeople;
import com.zzj.service.RecentContactPeopleService;
@Service
public class RecentContactPeopleServiceImpl  implements RecentContactPeopleService{
	
	@Autowired
	private RecentContactPeopleMapper recentContactPeopleMapper;
	
	
    public int deleteByPrimaryKey(Integer id) {
		return recentContactPeopleMapper.deleteByPrimaryKey(id);
	}

    public int insert(RecentContactPeople record) {
		return recentContactPeopleMapper.insert(record);
	}

    public int insertSelective(RecentContactPeople record) {
		return recentContactPeopleMapper.insertSelective(record);
	}

    public RecentContactPeople selectByPrimaryKey(Integer id) {
		return recentContactPeopleMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(RecentContactPeople record) {
		return recentContactPeopleMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(RecentContactPeople record) {
		return recentContactPeopleMapper.updateByPrimaryKey(record);
	}
}