package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TMeetingMapper;
import com.zzj.entity.TMeeting;
import com.zzj.service.TMeetingService;
@Service
public class TMeetingServiceImpl implements TMeetingService {
	
	@Autowired
	private TMeetingMapper tMeetingMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tMeetingMapper.deleteByPrimaryKey(id);
	}

    public int insert(TMeeting record) {
		return tMeetingMapper.insert(record);
	}

    public int insertSelective(TMeeting record) {
		return tMeetingMapper.insertSelective(record);
	}

    public TMeeting selectByPrimaryKey(Integer id) {
		return tMeetingMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TMeeting record) {
		return tMeetingMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TMeeting record) {
		return tMeetingMapper.updateByPrimaryKey(record);
	}
}