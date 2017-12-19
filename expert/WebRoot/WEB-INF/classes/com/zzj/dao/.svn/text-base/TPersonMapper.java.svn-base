package com.zzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzj.entity.TPerson;
import com.zzj.entity.TPersonWithBLOBs;

public interface TPersonMapper {
    public int deleteByPrimaryKey(Integer id)throws Exception;

    public int insert(TPersonWithBLOBs record)throws Exception;

    public int insertSelective(TPersonWithBLOBs record)throws Exception;

    public TPersonWithBLOBs selectByPrimaryKey(Integer id)throws Exception;

    public int updateByPrimaryKeySelective(TPersonWithBLOBs record)throws Exception;

    public int updateByPrimaryKeyWithBLOBs(TPersonWithBLOBs record)throws Exception;

    public int updateByPrimaryKey(TPerson record)throws Exception;
    
    //分页查询所有人
    public List<TPerson> selectAll(@Param("cp")int cp,@Param("ls")int ls);
    // 分页查询所有人数量
    public Integer selectAllCount();
    
    //分页查询所有人，根据isExpert
    public List<TPerson> selectAllByIsExpert(@Param("cp")int cp,@Param("ls")int ls,@Param("isExpert")int isExpert);
    // 分页查询所有人数量，根据isExpert
    public Integer selectAllByIsExpertCount(int isExpert);
    
    //分页查询不同地区的人，根据isExpert
    public List<TPerson> selectAllByRegionIsExpert(int cp,int ls,String region);
    //数量
    public Integer selectAllByRegionIsExpertCount(int isExpert,String region);
    
    //分页查询不同职称的人，根据isExpert
    public List<TPerson> selectAllByTitleIsExpert(int cp,int ls,int title);
    //数量
    public Integer selectAllByTitleIsExpertCount(int isExpert,int title);
}