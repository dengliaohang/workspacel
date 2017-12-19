package com.zzj.dao;

import java.util.List;
import java.util.Map;

import com.zzj.entity.DArea;

public interface DAreaMapper {
    public int deleteByPrimaryKey(String code) throws Exception;

    public int insert(DArea record) throws Exception;

    public int insertSelective(DArea record) throws Exception;

    public DArea selectByPrimaryKey(String code) throws Exception;

    public int updateByPrimaryKeySelective(DArea record) throws Exception;

    public int updateByPrimaryKey(DArea record) throws Exception;
    
    
    //查询所有一级
    public List<DArea> selectAllFirstDArea(String classId) throws Exception;
    
    //根据一级查询二级
    public List<DArea> selectAllDAreaByFirstCode(String firstCode) throws Exception;
    
    
}