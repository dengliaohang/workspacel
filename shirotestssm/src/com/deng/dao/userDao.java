package com.deng.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.deng.entity.Role;
import com.deng.entity.User;
import com.deng.entity.UserRole;
@Repository
public interface userDao {
	 User queryUserByUsername(String username);
	 List<String> queryPermission(int roleId);
	 List<UserRole> queryUserRole(int userid);
	 Role queryRole(int roleid);
}
