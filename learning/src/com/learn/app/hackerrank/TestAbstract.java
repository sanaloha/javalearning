package com.learn.app.hackerrank;


/**
 * You cannot instantiate an abstract class
 * You can't mark a class as both abstract and final
 * You can't mark a class as both abstract and private
 * You can't combine a class as both abstract and static
 * Abstract class  lets you take advantage of polymorphism, and gives you the greatest degree 
	of flexibility and extensibility. 
 * put abstract keyword to make class abstract.
 * 
 * **/
public abstract class TestAbstract {
	
	public abstract void callToACtion();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestAbstract absi = new TestAbstract(); can't initiate abstract class.
		
		TestAbstract absi = new TestAbstract() {
			
			@Override
			public void callToACtion() {
				// TODO Auto-generated method stub
				System.out.println("Inside abstract");
				
			}
		};
		absi.callToACtion();

	}

}

