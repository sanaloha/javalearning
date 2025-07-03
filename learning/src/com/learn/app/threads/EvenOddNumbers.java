package com.learn.app.threads;

public class EvenOddNumbers implements Runnable{
	
	Object object;
	static int i=1;
	
	public EvenOddNumbers(Object object) {
		this.object = object;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = new Object();
		Runnable th1 = new EvenOddNumbers(obj);
		Runnable th2 = new EvenOddNumbers(obj);
		
		new Thread(th1, "even").start();
		new Thread(th2, "odd").start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(i<10) {
			
			if(i%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized(object) {
					
					System.out.println("Thread Name="+Thread.currentThread().getName()+":"+i);
					i++;
					try{
						object.wait();
					}catch(InterruptedException ex) {
						ex.printStackTrace();
					}
					
				}
			}
			if(i%2!=0 && Thread.currentThread().getName().equals("odd")) {
				synchronized(object) {
					
					System.out.println("Thread Name="+Thread.currentThread().getName()+":"+i);
					i++;
					object.notify();
					
				}
			}
			
		}
		
	}

}
