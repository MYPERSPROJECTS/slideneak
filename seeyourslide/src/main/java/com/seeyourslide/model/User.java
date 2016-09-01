package com.seeyourslide.model;

public class User {
	private int id;
	private String content;
	
	
	public User(int id, String content) {
		this.id = id;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
