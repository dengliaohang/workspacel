package com.zzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzj.entity.Merchandise;

public interface MerchandiseMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(Merchandise record)throws Exception;

    public int insertSelective(Merchandise record)throws Exception;

    public  Merchandise selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(Merchandise record)throws Exception;

    public int updateByPrimaryKeyWithBLOBs(Merchandise record)throws Exception;

    public int updateByPrimaryKey(Merchandise record)throws Exception;
    
    
    //查询全部成果   type=0为成果             1为  需求   2为服务
    
    public List<Merchandise> selectMerchandiseByType(@Param("cp")int cp, @Param("ls")int ls,@Param("merchandiseType")int merchandiseType) throws Exception;
    
    //查询成果/需求/服务的总数
    
    public Integer selectAllCount(int merchandiseType); 
    
    //根据地区查询成果/需求/服务的总数
    
    public Integer selectAllCountByDRegion(@Param("merchandiseType")int merchandiseType,@Param("regionId")String regionId); 
    
    //根据地区查询成果/需求/服务
    
    public List<Merchandise> selectMerchandiseByDRegion(@Param("cp")int cp, @Param("ls")int ls,@Param("regionId")String regionId,@Param("merchandiseType")int merchandiseType) throws Exception;
    
    //根据职业查询成果/需求/服务的总数
    
    public Integer selectAllCountByPTitle(@Param("merchandiseType")int merchandiseType,@Param("ptitleId")String ptitleId); 
    
    //根据职业查询成果/需求/服务
    //数据库该表里的areaid对应 ptitleid       数据库字段没有更改
    
    public List<Merchandise> selectMerchandiseByPTitle(@Param("cp")int cp, @Param("ls")int ls,@Param("ptitleId")String ptitleId,@Param("merchandiseType")int merchandiseType) throws Exception;
    
    
    //搜索栏模糊查询 成果/需求/服务  的总数
    public Integer selectAllCountByDescription(@Param("merchandiseType")int merchandiseType,@Param("description")String description); 
    
    //搜索栏模糊查询 成果/需求/服务
    
    public List<Merchandise> selectMerchandiseByDescription(@Param("cp")int cp, @Param("ls")int ls,@Param("merchandiseType")int merchandiseType,@Param("description")String description)throws Exception;
    
}