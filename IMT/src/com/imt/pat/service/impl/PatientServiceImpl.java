package com.imt.pat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imt.pat.dao.PatientDao;
import com.imt.pat.entity.Country;
import com.imt.pat.entity.Disease;
import com.imt.pat.entity.Net;
import com.imt.pat.entity.PageLimit;
import com.imt.pat.entity.patientEntity;
import com.imt.pat.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService{
		@Autowired
		PatientDao patientDao;
			//增加患者
		public int addPatient(patientEntity patientEntity){
			return patientDao.addPatient(patientEntity);
		}
		//查询所有患者
		@Override
		public List<patientEntity> queryAllPatient( PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryAllPatient(pageLimit);
		}
		
		//新资源30天内 新资源
		@Override
		public List<patientEntity> queryNewPatient(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryNewPatient(pageLimit);
		}
		
		//超过三十天的过期资源
		@Override
		public List<patientEntity> queryOutPatient(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			
			
			
			return patientDao.queryOutPatient( pageLimit);
		}
		
		
		
		//查询有效资源的数量
		@Override
		public int queryNewPatientCount(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryNewPatientCount( pageLimit);
		}
		
		
		
		//查询过期资源的数量
		@Override
		public int queryOutPatientCount(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryOutPatientCount(pageLimit);
		}
		//查询所有患者数量
		@Override
		public int queryAllPatientCount(patientEntity patientEntity) {
			// TODO Auto-generated method stub
			
			return patientDao.queryAllPatientCount(patientEntity);
		}
		//查询无效资源
		@Override
		public List<patientEntity> queryInvalidResource(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryInvalidResource(pageLimit);
		}
		//查询无效资源数量
		@Override
		public int queryInvalidResourceCount(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryInvalidResourceCount(pageLimit);
		}
		//转资源
		@Override
		public int updatePatientToUser(int i,int a) {
			
			return patientDao.updatePatientToUser(i, a);
		}
		//删除患者 （患者信息不可真删，所以修改在数据中的状态isDel=0）
		@Override
		public int updatePatient(int[] ids) {
			// TODO Auto-generated method stub
			return patientDao.updatePatient(ids);
		}
		//恢复已删除的患者信息
		@Override
		public int recoveryPatient(int[] ids) {
			// TODO Auto-generated method stub
			return patientDao.recoveryPatient(ids);
		}
		//通过id查询患者
		@Override
		public patientEntity queryPatientById(patientEntity p) {
			// TODO Auto-generated method stub
			
			return patientDao.queryPatientById(p);
		}
		//修改患者信息
		@Override
		public int updatePatiento(patientEntity patientEntity) {
			// TODO Auto-generated method stub
			return patientDao.updatePatiento(patientEntity);
		}
		//通过名字模糊查询
		@Override
		public List<patientEntity> queryPatientByText(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByText(pageLimit);
		}
		@Override
		public List<Country> queryAllCountry() {
			// TODO Auto-generated method stub
			return patientDao.queryAllCountry();
		}
		@Override
		public List<Disease> queryAllDisease() {
			// TODO Auto-generated method stub
			return patientDao.queryAllDisease();
		}
		@Override
		public List<Net> queryAllNet() {
			// TODO Auto-generated method stub
			return patientDao.queryAllNet();
		}
		@Override
		public String queryCountryById(int id) {
			// TODO Auto-generated method stub
			return patientDao.queryCountryById( id);
		}
		@Override
		public String queryDiseaseById(int id) {
			// TODO Auto-generated method stub
			return patientDao.queryDiseaseById(id);
		}
		@Override
		public String queryNetById(int id) {
			// TODO Auto-generated method stub
			return patientDao.queryNetById(id);
		}
		@Override
		public List<Country> queryAllCountryl(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryAllCountryl(pageLimit);
		}
		@Override
		public int queryCountryCount() {
			// TODO Auto-generated method stub
			return patientDao.queryCountryCount();
		}
		@Override
		public List<Disease> queryAllDiseasel(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryAllDiseasel(pageLimit);
		}
		@Override
		public int queryDiseaseCount() {
			// TODO Auto-generated method stub
			return patientDao.queryDiseaseCount();
		}
		@Override
		public List<Net> queryAllNetl(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryAllNetl(pageLimit);
		}
		@Override
		public int queryNetCount() {
			// TODO Auto-generated method stub
			return patientDao.queryNetCount();
		}
		@Override
		public int addCoun(String coun) {
			// TODO Auto-generated method stub
			return patientDao.addCoun(coun);
		}
		@Override
		public int addDisease(String disease) {
			// TODO Auto-generated method stub
			return patientDao.addDisease(disease);
		}
		@Override
		public int addNet(String net) {
			// TODO Auto-generated method stub
			return patientDao.addNet(net);
		}
		@Override
		public int updateCountryl(Country c) {
			// TODO Auto-generated method stub
			return patientDao.updateCountryl(c);
		}
		@Override
		public int updateDiseasel(Disease d) {
			// TODO Auto-generated method stub
			return patientDao.updateDiseasel(d);
		}
		@Override
		public int updateNetl(Net n) {
			// TODO Auto-generated method stub
			return patientDao.updateNetl(n);
		}
		@Override
		public List<patientEntity> queryAllPatientByk(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryAllPatientByk(pageLimit);
		}
		@Override
		public int queryAllPatientCountByk(patientEntity patientEntity) {
			// TODO Auto-generated method stub
			return patientDao.queryAllPatientCountByk(patientEntity);
		}
		@Override
		public List<patientEntity> queryPatientByCoun(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByCoun(p);
		}
		@Override
		public int queryPatientByCounl(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByCounl(p);
		}
		@Override
		public List<patientEntity> queryPatientByCounK(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByCounK(p);
		}
		@Override
		public int queryPatientByCounKl(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByCounKl(p);
		}
		@Override
		public List<patientEntity> queryPatientByPhone(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByPhone(p);
		}
		@Override
		public int queryPatientByPhonel(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByPhonel(p);
		}
		@Override
		public List<patientEntity> queryPatientByEmail(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByEmail(p);
		}
		@Override
		public int queryPatientByEmaill(PageLimit p) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByEmaill(p);
		}
		@Override
		public List<patientEntity> testPhone(String phone) {
			// TODO Auto-generated method stub
			return patientDao.testPhone(phone);
		}
		@Override
		public List<patientEntity> testEmail(String email) {
			// TODO Auto-generated method stub
			return patientDao.testEmail(email);
		}
		@Override
		public int queryTodayRes(String today, int net) {
			// TODO Auto-generated method stub
			return patientDao.queryTodayRes(today, net);
		}
		@Override
		public int queryLastRes(String last, int net) {
			// TODO Auto-generated method stub
			return patientDao.queryLastRes(last, net);
		}
		@Override
		public List<patientEntity> queryAllPatientC(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryAllPatientC(pageLimit);
		}
		@Override
		public int queryAllPatientCountC(patientEntity patientEntity) {
			// TODO Auto-generated method stub
			return patientDao.queryAllPatientCountC(patientEntity);
		}
		@Override
		public int queryPatientByTextCount(PageLimit pageLimit) {
			// TODO Auto-generated method stub
			return patientDao.queryPatientByTextCount(pageLimit);
		}
	
	
}
