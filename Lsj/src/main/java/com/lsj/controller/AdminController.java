package com.lsj.controller;


import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lsj.entity.Archives;
import com.lsj.entity.Article;
import com.lsj.service.IArticleService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
@Controller
@RequestMapping
public class AdminController {

	
	@Autowired
	private IArticleService articleService;
	
	@RequestMapping("/insertarticle")
	public String insertArticle(@RequestParam String title,@RequestParam String summry,@RequestParam String content,@RequestParam String kind,Model model){
		try {
			
			Article article =new Article();
			article.setContent(content);
			LocalDate date = LocalDate.now();
			article.setDate(date.toString());
			Random ran = new Random();
			int ranimg = ran.nextInt(6)+1;
			article.setImgUrl("/theme/images/img-"+ranimg+".jpg");
			article.setKind(kind);
			article.setStat("0");
			article.setSummry(summry);
			article.setTitle(title);
			articleService.save(article);
			model.addAttribute("msg","新增成功");
		} catch (Exception e) {
			model.addAttribute("msg","新增失败");
		}
		return "admin/index";
		
	}
	
}
