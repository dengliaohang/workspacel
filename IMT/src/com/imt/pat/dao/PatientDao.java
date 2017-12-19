package com.imt.pat.dao;

import java.util.List;

import com.imt.pat.entity.Country;
import com.imt.pat.entity.Disease;
import com.imt.pat.entity.Net;
import com.imt.pat.entity.PageLimit;
import com.imt.pat.entity.patientEntity;

public interface PatientDao {
		//通过id查询患者
		patientEntity queryPatientById(patientEntity p);
		//增加患者
		int addPatient(patientEntity patientEntity);
		//查询所有患者门诊的
		List<patientEntity> queryAllPatient(PageLimit pageLimit);
		//查询所有患者客服的
		List<patientEntity> queryAllPatientByk(PageLimit pageLimit);
		//查询所有患者总数
		int queryAllPatientCount(patientEntity patientEntity);
		//查询所有患者总数客服的
		int queryAllPatientCountByk(patientEntity patientEntity);
		//新资源30天内 新资源
		List<patientEntity> queryNewPatient(PageLimit pageLimit);
		//过期资源 30天外  过期资源
		List<patientEntity> queryOutPatient(PageLimit pageLimit);
		//无效资源 resource_state  ==no   无效
		//查询无效资源
		List<patientEntity> queryInvalidResource(PageLimit pageLimit);
	
		//查询新资源的数量
		int queryNewPatientCount(PageLimit pageLimit);
		
		//查询过期资源的数量
		int  queryOutPatientCount(PageLimit pageLimit);
		//查询无效资源数量
		int  queryInvalidResourceCount(PageLimit pageLimit);
		//删除患者 （患者信息不可真删，所以修改在数据中的状态isDel=0）
		int updatePatient(int[] ids);
		//转资源
		public int updatePatientToUser(int i,int a);
		//恢复删除的患者信息
		int recoveryPatient(int[] ids);
		//修改患者
		int updatePatiento(patientEntity patientEntity);
		//通过名字模糊查询
		List<patientEntity> queryPatientByText(PageLimit pageLimit);
		//通过名字模糊查询数量
		int queryPatientByTextCount(PageLimit pageLimit);
		//查询国家
		List<Country> queryAllCountry();
		List<Country> queryAllCountryl(PageLimit pageLimit);
		int queryCountryCount();
		//修改国家
		int updateCountryl(Country c);
		//添加国家
		int addCoun(String coun);
		//通过id查国家
		String queryCountryById(int id);
		//查询病种
		List<Disease> queryAllDisease();
		List<Disease> queryAllDiseasel(PageLimit pageLimit);
		int queryDiseaseCount();
		//添加病种
		int addDisease(String disease);
		//修改病种
		int updateDiseasel(Disease d);
		//通过id查病种
		String queryDiseaseById(int id);
		//查询网址
		List<Net> queryAllNet();
		List<Net> queryAllNetl(PageLimit pageLimit);
		int queryNetCount();
		//修改网址
		int updateNetl(Net n);
		//添加网站
		int addNet(String net);
		//通过id查网址
		String queryNetById(int id);
		//通过 国家查询 患者   门诊的
		List<patientEntity> queryPatientByCoun(PageLimit p);
		int queryPatientByCounl(PageLimit p);
		//通过 国家查询 患者   客服的
		List<patientEntity> queryPatientByCounK(PageLimit p);
		int queryPatientByCounKl(PageLimit p);
		//通过电话模糊查询
		List<patientEntity> queryPatientByPhone(PageLimit p);
		int queryPatientByPhonel(PageLimit p);
		//通过邮箱模糊查询
		List<patientEntity> queryPatientByEmail(PageLimit p);
		int queryPatientByEmaill(PageLimit p);
		//电话查重
		List<patientEntity> testPhone(String phone);
		//邮箱查重
		List<patientEntity> testEmail(String email);
		//查询今天的录入资源数量
		int queryTodayRes(String today,int net);
		//查询昨天录入资源数量
		int queryLastRes(String last,int net);
		//查询所有患者超级管理员的的
		List<patientEntity> queryAllPatientC(PageLimit pageLimit);
		//查询所有患者总数超级管理员的
		int queryAllPatientCountC(patientEntity patientEntity);
}

