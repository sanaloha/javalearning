package com.learn.app.threads;

public class VisibilityDemo {
	
	int x=0;
	public void writeX() {
		x=1;
	}
	public void readX() {
		int r=x;
		System.out.println("r"+r);
	}

	public static void main(String[] args) {
		VisibilityDemo v1 = new VisibilityDemo();
		VisibilityDemo v2 = new VisibilityDemo();
		
		Thread t1 = new Thread(
				
				()->{v1.writeX();
				});
		Thread t2 = new Thread(
				()->{
					v1.readX();
				});
		
		t1.start();
		t2.start();
		

	}

}
