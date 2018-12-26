package com.lsj.service.impl;

import com.lsj.entity.Logs;
import com.lsj.mapper.LogsMapper;
import com.lsj.service.ILogsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-19
 */
@Service
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs> implements ILogsService {
	
	@Autowired
	private LogsMapper logsMapper;
	
	public void insertLog(String desc){
		Logs logs=new Logs();
		logs.setDate(LocalDateTime.now());
		logs.setLogDesc(desc);
		logs.setStat("0");
		logsMapper.insert(logs);
	}
	

}
