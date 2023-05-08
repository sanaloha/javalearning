package com.learn.java8.features.functional;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		Runnable calculateTax = new Runnable() {

			@Override
			public void run() {
				System.out.println("RUNNABLE");
				
			}
			
		};
		
		//threadPool.submit(calculateTax);
		Runnable calc = ()->{
			System.out.println("Hello");
		};
		//threadPool.submit(calc);
		//comparator
		User user1 = new User();
		User user2 = new User();
		
		Comparator<User> comp = new Comparator<User>() {
			public int compare(User user1, User user2) {
				return user1.getName().compareTo(user2.getName());
			}
		};
		
		System.out.println(comp.compare(user1, user2));
		//using lambda
		Comparator<User> comp1 = (a,b)->{
			return a.getName().compareTo(b.getName());
		};
		
		System.out.println(comp1.compare(user1, user2));
	}

	
}

class User{
	
	private String name ="SAN";
	
	public String getName() {
		return this.name;
	}
}
