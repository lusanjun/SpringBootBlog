package com.lsj.entity;

import java.util.List;

public class Archives {

	private String date;
	private List<Article> list;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Article> getList() {
		return list;
	}
	public void setList(List<Article> list) {
		this.list = list;
	}
	
	
}
