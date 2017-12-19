package com.zzj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzj.dao.TAccountRecordMapper;
import com.zzj.entity.TAccountRecord;
import com.zzj.service.TAccountRecordService;
@Service
public class TAccountRecordServiceImpl implements TAccountRecordService {
	
	@Autowired
	private TAccountRecordMapper tAccountRecordMapper;
	
    public int deleteByPrimaryKey(Integer id) {
		return tAccountRecordMapper.deleteByPrimaryKey(id);
	}

    public int insert(TAccountRecord record) {
		return tAccountRecordMapper.insert(record);
	}

    public int insertSelective(TAccountRecord record) {
		return tAccountRecordMapper.insertSelective(record);
	}

    public TAccountRecord selectByPrimaryKey(Integer id) {
		return tAccountRecordMapper.selectByPrimaryKey(id);
	}

    public int updateByPrimaryKeySelective(TAccountRecord record) {
		return tAccountRecordMapper.updateByPrimaryKeySelective(record);
	}

    public int updateByPrimaryKey(TAccountRecord record) {
		return tAccountRecordMapper.updateByPrimaryKey(record);
	}
}