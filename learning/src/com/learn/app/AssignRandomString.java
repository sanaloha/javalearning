package com.learn.app;

public class AssignRandomString {

	// Define a name and random no x
			//public static int x = (int) (Math.random()*5)
			//create constructor and make a call to arg constructor.
			////create no arg const

	public String name;
	public static int x = (int)(Math.random()*4);
	
	public AssignRandomString() {
		this(x);
	}
	
	public AssignRandomString(int x2) {
		this.name = new String[]{"Santosh","AMIT","GOLU","SOMU"}[x];
	}

	public static void main(String[] args) {
		
		AssignRandomString assign = new AssignRandomString();
		System.out.println("Random name="+assign.name);
		
		
	}

}
