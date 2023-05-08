package com.learn.app.threads;

public class MyThread extends Thread{
	
	
	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.start();
		
		printAll(args);
		
	}
	@Override
	public void run() {
		
		for(int i=0;i<3;i++) {
			System.out.println(i+".....");
		}
		
	}

	public static void printAll(String[] args) {
		System.out.println("Name="+Thread.currentThread().getName()+args.length);
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
			try {
				Thread.currentThread().sleep(1000);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
