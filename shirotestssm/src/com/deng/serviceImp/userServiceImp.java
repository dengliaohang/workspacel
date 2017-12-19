package com.deng.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deng.dao.userDao;
import com.deng.entity.Role;
import com.deng.entity.User;
import com.deng.entity.UserRole;
import com.deng.service.userService;
@Service
public class userServiceImp implements userService{
	@Autowired
	private userDao ser;
	@Override
	public User queryUserByUsername(String username) {
		// TODO Auto-generated method stub
		
		return ser.queryUserByUsername(username);
	}
	//权限信息加到list中
	@Override
	public List<String> queryPermission(int roleId) {
		// TODO Auto-generated method stub
		Role queryRole = ser.queryRole(roleId);
		List<String> q = ser.queryPermission(roleId);
		List<String> per=new ArrayList<String>();
		for(String q1:q){
			per.add(q1);
		}
		return per;
	}
	@Override
	public List<UserRole> queryUserRole(int userid) {
		// TODO Auto-generated method stub
		return ser.queryUserRole(userid);
	}
	@Override
	public Role queryRole(int roleid) {
		// TODO Auto-generated method stub
		return ser.queryRole(roleid);
	}

}
