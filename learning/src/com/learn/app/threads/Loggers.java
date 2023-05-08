package com.learn.app.threads;

public class Loggers {
	
	private StringBuilder contents = new StringBuilder();
	
	public void log(String message) {
		contents.append(System.currentTimeMillis());
		contents.append(".  ");
		contents.append(Thread.currentThread().getName());
		contents.append(message);
		System.out.println(contents.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
		
	}

}

class ExThread extends Thread{
	public void run() {
		Loggers logger= new Loggers();
		logger.log("From Thread=========");
		
	}
	
}
class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		Loggers logger = new Loggers();
		logger.log("Inisde Runnable========");
	}
}