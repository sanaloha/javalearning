package com.learn.java8.features.lambda;

public class LambdaExpressionExample {

	public static void main(String[] arls) {
		int width=10;
		//without lambda
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Inside draw "+width);
			}
		};
		
		d.draw();
		
		//with labmda
		Drawable d2 = ()->{
			System.out.println("Drawable lambda "+width);
		};
		d2.draw();
		
		Addable addition = (a,b)->{
			return a+b;
		};
		System.out.println(addition.add(4, 5));
		
		Runnable runmeth = ()->{
			System.out.println("Welcome to RUN");
		};
		Thread th = new Thread(runmeth);
		th.start();
	}
	
	
}
interface Addable{
	
	public int add(int a, int b);
}

interface Drawable {
	public void draw();
}

interface Sayable{
	public void say();
}