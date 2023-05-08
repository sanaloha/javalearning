package com.learn.java8.features.functional;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doable doDem = ()->System.out.println("DO JOB");
		
		doDem.dJob();
		
		doDem = ()->{
			int a =50;
			int b=55;
			int res = a+b;
			System.out.println("Result="+res);
		};
		doDem.dJob();

	}

}

interface Doable {
	
	public void dJob();
}
