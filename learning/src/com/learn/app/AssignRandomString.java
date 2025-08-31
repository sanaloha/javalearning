
package com.learn.app;

public class AssignRandomString {

	public String name;
	public static int randomInt = (int)(Math.random()*4);
	
	public AssignRandomString() {
		this(randomInt);
	}
	
	public static String getRandomElement() {
		
	//declare an array
	String [] employeeName = {"Antony","Santosh","Samit","Rajen"};
	//get the random number upto 3, as we have length of array as 4
	Integer rNum = (int) (Math.random()*3);
		
	return employeeName[rNum];
		
	}
	
	public AssignRandomString(int x2) {
		//this.name = new String[]{"Santosh","AMIT","GOLU","SOMU"}[x];
		this.name = new String[] {"Man","Map","collection","Collections","Java24"}[randomInt];
	}

	public static void main(String[] args) {
		
		AssignRandomString assign = new AssignRandomString();
		System.out.println("Value of X="+randomInt);
		System.out.println("Random name="+assign.name);
		System.out.println("Return random employee"+getRandomElement());
		
		
	}

}
