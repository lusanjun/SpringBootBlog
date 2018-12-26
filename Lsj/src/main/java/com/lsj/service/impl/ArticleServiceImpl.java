package com.lsj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsj.entity.Archives;
import com.lsj.entity.Article;
import com.lsj.mapper.ArticleMapper;
import com.lsj.service.IArticleService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

	@Autowired
	private ArticleMapper articleMapper;
	public List<Article> getList(){
		 List<Article> list=articleMapper.selectList(new QueryWrapper<Article>().eq("stat", "0").orderByDesc("date"));
		 return list;
		
	}
	@Override
	public Article getById(Long id) {
		articleMapper.selectById(id);
		return articleMapper.selectById(id);
	}
	
	@Override
	public List<Archives> getListByDate() {
		List<Article> list1=articleMapper.selectList(new QueryWrapper<Article>().eq("stat", "0").orderByDesc("date"));
		List<String> years=new ArrayList<String>();
		List<Archives> archivesList=new ArrayList<Archives>();
		for(Article art:list1){
			String[] date = art.getDate().split("-");
			String year=date[0];
			if(!years.contains(year)){
				years.add(year);
			}
		}
		for(String str:years){
			Archives archives=new Archives();
			archives.setDate(str);
			List<Article> selectList = articleMapper.selectList(new QueryWrapper<Article>().eq("stat", "0").like("date", str).orderByDesc("date"));
			archives.setList(selectList);
			archivesList.add(archives);
		}
		return archivesList;
	}
	
}
