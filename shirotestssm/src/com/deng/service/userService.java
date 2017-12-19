package com.deng.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deng.entity.Role;
import com.deng.entity.User;
import com.deng.entity.UserRole;
public interface userService {
 User queryUserByUsername(String username);
 List<String> queryPermission(int roleId);
 List<UserRole> queryUserRole(int userid);
 Role queryRole(int roleid);
}
