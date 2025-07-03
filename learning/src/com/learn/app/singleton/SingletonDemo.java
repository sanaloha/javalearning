package com.learn.app.singleton;

import java.io.Serializable;

public class SingletonDemo implements Serializable{
	
	private static SingletonDemo SingletonDemoObj =null;
	
	//make the constructor private so no one can instantiate object outside
	private SingletonDemo() {
		
	}
	
	//create public static method to access the singular instance.
	public static SingletonDemo getInstance() {
		
		if(SingletonDemoObj !=null)
			return SingletonDemoObj;
		
		return new SingletonDemo();
	}
	
	 // implement readResolve method to overcome the serialization issue.
   // protected Object readResolve() { return SingletonDemoObj; }

}
