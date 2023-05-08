package com.learn.java8.features.lambda;

public class LambdaRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(
				()->System.out.println("Inside run")
				);
			thread.start();
	}

}
