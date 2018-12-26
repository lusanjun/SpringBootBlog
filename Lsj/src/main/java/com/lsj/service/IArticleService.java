package com.lsj.service;

import com.lsj.entity.Archives;
import com.lsj.entity.Article;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
public interface IArticleService extends IService<Article> {
	
	public List<Article> getList();
	public Article getById(Long id);
	public List<Archives> getListByDate();

}
