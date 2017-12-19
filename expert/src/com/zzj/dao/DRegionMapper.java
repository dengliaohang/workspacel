package com.zzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzj.entity.DRegion;

public interface DRegionMapper{
    public int insert(DRegion record) throws Exception;

    public int insertSelective(DRegion record) throws Exception;
    
    //查询一级地名
    public List<DRegion> selectAllFirstDRegion();
    
    
    
    /**
     * 根据一级查询二级地名   
     * parm1 zonecode   parm2 class=1
     * */
    
    public List<DRegion> selectAllDRegionByFirstCode(@Param("zoneCode")String zoneCode,@Param("classId")String classId)throws Exception;
    
    
    /**
     * 根据二级查询三级地名
     * 
     * 根据regionId 前两位模糊查询   
     * */
    public List<DRegion> selectAllDRegionBySecondCode(@Param("regionid")String regionid)throws Exception;

}