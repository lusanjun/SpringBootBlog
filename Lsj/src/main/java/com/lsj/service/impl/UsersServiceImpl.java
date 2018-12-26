package com.lsj.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsj.entity.Users;
import com.lsj.exception.TipException;
import com.lsj.mapper.UsersMapper;
import com.lsj.service.IUsersService;
import com.lsj.util.Utils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

	
	private static final Logger log = LoggerFactory.getLogger(UsersServiceImpl.class);

	
	@Autowired
	private UsersMapper usersMapper;
	
	public Users login(String username,String password){
		
		Users userbyname = usersMapper.selectOne(new QueryWrapper<Users>().eq("userName", username).eq("stat", "0"));
		if(null==userbyname){
			throw new TipException("用户不存在");
		}
		String md5 = Utils.Md5(username+password);
		log.info(md5);
		Users userbypwd = usersMapper.selectOne(new QueryWrapper<Users>().eq("userName", username).eq("password", md5));
		if(null==userbypwd){
			throw new TipException("用户密码错误");
		}
		return userbypwd;
		
	}
}
