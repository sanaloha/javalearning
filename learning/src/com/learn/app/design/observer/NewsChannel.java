package com.learn.app.design.observer;

public class NewsChannel implements Channel{
	private String news;

	@Override
	public void update(String update) {
		this.news = update;
		// TODO Auto-generated method stub
		System.out.println("Received News");
		
	}

}
