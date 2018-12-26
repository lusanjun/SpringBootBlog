package com.lsj.service;

import com.lsj.entity.Logs;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-19
 */
public interface ILogsService extends IService<Logs> {
	
	public void insertLog(String desc);

}
