package com.learn.app;

public class PassByValueDemo {
	//pass by using object
	//pass by using array
	//pass by using primitive
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ballon red = new Ballon("RED"); //memory ref 50
		Ballon blue = new Ballon("blue"); //memory ref =100
		
		swap(red,blue);
		System.out.println("After swap method red value="+red.getColor()+" blue value="+blue.getColor());
		changeValue(blue);
		System.out.println("After changeValue method blue object value is="+blue.getColor());
		
		//
		int a=20;
		int b=40;
		addition(a,b);
		System.out.println("result of addition from main="+(a+b));
		//pass by value for non-primitive:
		Integer[] arr = new Integer[2];
		arr[0] = 2;
		arr[1]=4;
		add(arr);
		System.out.println("Addition of array from main="+(arr[0]+arr[1]));
		
		

	}
	public static void changeValue(Ballon ballon) {
		ballon.setColor("RED");
		ballon = new Ballon("Green");
		ballon.setColor("blue");
		
	}
	
	public static void swap(Object obj1, Object obj2) {
		Object temp = obj1;
		obj1 = obj2;
		obj2 = temp;
		
	}
	
	public static void add(Integer[] intArr) {
		intArr[0]=10;
		System.out.println("Result from Add:"+(intArr[0]+intArr[1]));
	}
	public static void addition(int a, int b) {
		a=10;
		System.out.println("Result from adition="+(a+b));
	}

}
 class Ballon{
	 private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	 
	public Ballon() {}
	public Ballon(String color) {
		this.color = color;
		
		
	}
	
 }