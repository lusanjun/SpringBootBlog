package com.lsj.config;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lsj.entity.Users;
import com.lsj.mapper.UsersMapper;

public class MyRealm 

extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}/*

	
   
	@Autowired
	private UsersMapper userMapper;

	
	private static final Logger log = LoggerFactory.getLogger(MyRealm.class);

	
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		log.info("=====身份认证====");
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String username = token.getUsername();
		Users user = userMapper.selectOne(new QueryWrapper<Users>().eq("userName", username));
		if(null==user){
    		throw new AccountException("用户名不存在");
    	}else{
    		if(!user.getPassword().equals(new String((char[])token.getPassword()))){
    			throw new AccountException("密码不正确");
    		}
    	}
		 return new SimpleAuthenticationInfo(token.getPrincipal(), user.getPassword(), getName());
	}
	
    
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		return null;
    	log.info("=====权限认证====");
    	String username = (String)SecurityUtils.getSubject().getPrincipal();
    	SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
    	Admin selectOne = userMapper.selectOne(new QueryWrapper<Admin>().eq("adminName", username));
    	if(null==selectOne){
    		throw new AccountException("用户名不存在");
    	}
    	
		return null;
        System.out.println("————权限认证————");
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获得该用户角色
        
        Admin selectOne = userMapper.selectOne(new QueryWrapper<Admin>().eq("adminName", username));\
        if(null==selectOne){
        	throw ExceptionController
        }
        Set<String> set = new HashSet<>();
        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
        set.add(role);
        //设置该用户拥有的角色
        info.setRoles(set);
        return info;
    }

*/}

