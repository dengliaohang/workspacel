package com.zzj.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zzj.entity.Merchandise;

public interface MerchandiseService {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(Merchandise record)throws Exception;

    public int insertSelective(Merchandise record)throws Exception;

    public  Merchandise selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(Merchandise record)throws Exception;

    public int updateByPrimaryKeyWithBLOBs(Merchandise record)throws Exception;

    public int updateByPrimaryKey(Merchandise record)throws Exception;
    
    //查询全部成果   type=0为成果             1为  需求         2为服务
    
    public Map<String, Object> selectMerchandiseByType(int cp, int ls,int merchandiseType) throws Exception;
    
    
    //根据地区查询 成果/需求/服务
    
    public Map<String, Object> selectMerchandiseByDRegion(int cp, int ls,String regionId,int merchandiseType) throws Exception;
    
    //根据职业查询 成果/需求/服务
    
    public Map<String, Object> selectMerchandiseByPTitle(int cp, int ls,String ptitleId,int merchandiseType) throws Exception;
    
    
    
    //搜索栏模糊查询 成果/需求/服务
    
    public Map<String,Object> selectMerchandiseByDescription(int cp,int ls,int merchandiseType,String description)throws Exception;
    
}