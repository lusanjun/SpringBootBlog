package com.lsj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	@ExceptionHandler(value = Exception.class)
	public String exception(Exception e){
		LOGGER.error("find exception:e={}",e.getMessage());
		e.printStackTrace();
		return "/admin/404";
	}

}
