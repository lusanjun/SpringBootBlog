package com.lsj.service.impl;

import com.lsj.entity.Sayings;
import com.lsj.mapper.SayingsMapper;
import com.lsj.service.ISayingsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 说说 服务实现类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
@Service
public class SayingsServiceImpl extends ServiceImpl<SayingsMapper, Sayings> implements ISayingsService {

}
