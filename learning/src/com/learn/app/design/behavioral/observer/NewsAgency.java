package com.learn.app.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	
	private String news;
	//maintain list of observers
	private List<Channel> channels = new ArrayList();
	
	//add observers
	public void addObserver(Channel channel) {
		this.channels.add(channel);
			
	}
	
	//remove observers
	public void removeObserver(Channel channel) {
		channels.remove(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		//pulish the news
		for(Channel channel:channels) {
			channel.update(news);
		}
		
	}

}
