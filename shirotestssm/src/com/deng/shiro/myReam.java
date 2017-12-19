package com.deng.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.deng.entity.User;
import com.deng.entity.UserRole;
import com.deng.service.userService;

public class myReam extends AuthorizingRealm{
	/** 用户的业务类 **/
	@Autowired
	private userService ser;
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pri) {
		// TODO Auto-generated method stub
		System.out.println("this  is  权限~~~~~~~");
		User user=(User) pri.getPrimaryPrincipal();
		Integer id = user.getId();
		if(id==1){
			System.out.println("this is   id====1");
			List<UserRole> qRole = ser.queryUserRole(id);
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			//获取能够访问的URL列表
			List<String> qu = ser.queryPermission(qRole.get(0).getRoleId());
			for(String r:qu){
				System.out.println("r==="+r);
				info.addStringPermission(r);
			}
			return info;
		}
		return null;
	}
	//登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token1) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("this is  登录shiro 验证·~~~~~~~~~~~~" );
		UsernamePasswordToken token=(UsernamePasswordToken)token1;
		String username = token.getUsername();
		char[] password = token.getPassword();
		String pass=new String(password);
		System.out.println(username);
		System.out.println(pass);
		System.out.println(22222222);
		
		if(username!=null){
			User user = ser.queryUserByUsername(username);
			System.out.println("user====="+user);
		    //账号不存在
	        if(user == null) {
	        	System.out.println("1账号或密码不正确");
	            throw new UnknownAccountException("账号或密码不正确");
	        }
			if(user!=null){
		        //密码错误
		        if(!pass.equals(user.getPassword())) {
		        	System.out.println("2账号或密码不正确");
		            throw new IncorrectCredentialsException("账号或密码不正确");
		        }
				System.out.println(user);
				return new SimpleAuthenticationInfo(user, user.getPassword(),getName());
			}
		}
		return null;
	}

}
