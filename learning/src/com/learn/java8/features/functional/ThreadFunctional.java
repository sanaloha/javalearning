package com.learn.java8.features.functional;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		/**
		 * create runnable object with functional programming
		 * 
		 * **/
		
		Runnable service = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Inside service");
				
			}
			
			
		};
		

		Thread serviceThread = new Thread(service);
		
		serviceThread.start();
		//using lambda expression
		Runnable order = ()->{
			
			System.out.println("Inside order");
			
		};
		
		Thread orderThread = new Thread(order);
		orderThread.start();
		
		//another way
		Thread threadAno = new Thread( new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Inside threadAno");
				
			}
			
		});
		threadAno.start();
		
		//anaonymous way
		Thread anonymousThread = new Thread(
				()->{
					int a=5,b=6;
					System.out.println("SUM=="+(a+b));
				}
				);
		anonymousThread.start();
		
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
		User user1 = new User("Santosh",37);
		User user2 = new User("Santy",37);
		
		//Create comparator using names
		Comparator<User> comp = new Comparator<User>() {
			public int compare(User user1, User user2) {
				return user1.getName().compareTo(user2.getName());
			}
		};
		
		System.out.println("Compare by name "+comp.compare(user1, user2));
		//using lambda
		Comparator<User> comp1 = (a,b)->{
			return a.getName().compareTo(b.getName());
		};
		user1.setName("Santosh");
		System.out.println("Compare by name and lambda "+comp1.compare(user1, user2));
		
		//Create comparator based on age.
		Comparator<User> compareAge = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getAge().compareTo(o2.getAge());
			}
			
		};
		System.out.println("Users are "+compareAge.compare(user1, user2));
		//create comparator based on lambda function
		
		Comparator<User> compAgeLambda = (a,b)->{
			
			return a.getAge().compareTo(b.getAge());
			
		};
		user1.setAge(44);
		System.out.println("Compare age using lambda "+compAgeLambda.compare(user1, user2));
	}

	
}

class User{
	
	private String name;
	private Integer age;
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
		
	}
		
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
}

//old way of creating runnable

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
