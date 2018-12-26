package com.lsj.service;

import com.lsj.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
public interface IUsersService extends IService<Users> {
	public Users login(String username,String password);
}
