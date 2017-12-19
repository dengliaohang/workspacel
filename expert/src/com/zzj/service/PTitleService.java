package com.zzj.service;

import java.util.List;

import com.zzj.entity.PTitle;

public interface PTitleService {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(PTitle record)throws Exception;

    public int insertSelective(PTitle record)throws Exception;

    public PTitle selectByPrimaryKey(int id)throws Exception;

    public int updateByPrimaryKeySelective(PTitle record)throws Exception;

    public int updateByPrimaryKey(PTitle record)throws Exception;
    
    
    //level为0  查询第一级菜单    
    public List<PTitle> selectPTitleByLevel(String level) throws Exception;
    
    //level=1   查询二级菜单  根据code      level=2查询三级菜单
    public List<PTitle> selectPTitleByCode(String level,String parentCode) throws Exception;
    
}