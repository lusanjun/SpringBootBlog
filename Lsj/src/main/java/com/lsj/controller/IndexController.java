package com.lsj.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsj.entity.Archives;
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
public class IndexController {

	
	@Autowired
	private IArticleService articleService;
	
	@RequestMapping(value={"/","/index"})
	public String index(Model model){
		articleService.getList();
		model.addAttribute("articles",articleService.getList());
		return "theme/index";
		
	}
	
	@RequestMapping("details")
	public String toDetails(Model model,Long id){
		model.addAttribute("article",articleService.getById(id));
		return "theme/article";
		
	}
	
	@RequestMapping("archives")
	public String archives(Model model){
		List<Archives> listByDate = articleService.getListByDate();
		model.addAttribute("archives",listByDate);
		return "theme/archives";
		
	}
	
	@RequestMapping("about")
	public String about(){
		return "theme/about";
		
	}
	
}
