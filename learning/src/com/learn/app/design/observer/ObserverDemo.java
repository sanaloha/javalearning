package com.learn.app.design.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewsAgency newsAgency = new NewsAgency();
		Channel channelA = new NewsChannel();
		Channel channelB = new NewsChannel();
		
		newsAgency.addObserver(channelA);
		newsAgency.addObserver(channelB);
		newsAgency.setNews("Breaking news=====");
				

	}

}
