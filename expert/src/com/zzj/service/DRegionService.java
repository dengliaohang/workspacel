package com.zzj.service;

import java.util.List;
import java.util.Map;

import com.zzj.entity.DArea;
import com.zzj.entity.DRegion;

public interface DRegionService{
    public int insert(DRegion record) throws Exception;

    public int insertSelective(DRegion record) throws Exception;
    
    
    //查询一级地名
    public List<DRegion> selectAllFirstDRegion()throws Exception;
    
    /**
     * 根据一级查询二级地名   
     * parm1 zonecode   parm2 class=1
     * */
    
    public List<DRegion> selectAllDRegionByFirstCode(String zoneCode,String classId)throws Exception;
    
    
    /**
     * 根据二级查询三级地名
     * 模糊查询
     * 根据regionId 前两位模糊查询  
     * */
    public List<DRegion> selectAllDRegionBySecondCode(String regionId)throws Exception;

}