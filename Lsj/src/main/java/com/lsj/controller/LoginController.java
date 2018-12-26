package com.lsj.controller;


import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lsj.entity.Users;
import com.lsj.exception.TipException;
import com.lsj.service.ILogsService;
import com.lsj.service.IUsersService;

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
public class LoginController {


	private static final Logger log = LoggerFactory.getLogger(LoginController.class);


	@Autowired
	private IUsersService userService;
	@Autowired
	private ILogsService logsService;

	@RequestMapping(value={"/toLogin","/login"})
	public String toLogin(){
		return "admin/login";
	}

	@RequestMapping(value={"/dologin"})
	public String toindex(@RequestParam String username,@RequestParam String password,
			@RequestParam(required = false) String rememberMe,Model model){
//		try {
//			Subject subject = SecurityUtils.getSubject();
//			String md5pwd = Utils.Md5(username+password);
//			boolean rememberme=false;
//			if(StringUtils.isNotBlank(rememberMe)){
//				rememberme=true;
//			}
//			UsernamePasswordToken token = new UsernamePasswordToken(username, md5pwd,rememberme);
//			subject.login(token);
//			logsService.insertLog(username+"-登录成功");
//			log.info(username+"-登录成功    "+LocalDateTime.now());
//			return "admin/index";
//		} catch (Exception e) {
//			String msg = e.getMessage();
//			log.error(username+"-登录失败    "+LocalDateTime.now());
//			model.addAttribute("msg",msg);
//			return "admin/login";
//		}
		
		try {
			Users login = userService.login(username, password);
			log.info(login.toString());
			logsService.insertLog(username+"-登录成功");
			log.info(username+"-登录成功    "+LocalDateTime.now());
			return "admin/index";
		} catch (Exception e) {
			String msg = "登录失败";
			if (e instanceof TipException) {
				msg = e.getMessage();
			} else {
				log.error(msg,e);
			}
			log.error(username+"-登录失败    "+LocalDateTime.now());
			model.addAttribute("msg",msg);
			return "admin/login";
		}

	}
}
