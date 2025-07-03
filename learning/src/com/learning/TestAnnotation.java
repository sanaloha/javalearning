package com.learning;

import java.util.ArrayList;

public class TestAnnotation {
	
	Animal animal = new Animal();
	
	@SuppressWarnings("unchecked")  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		animal.eatSomething();
		
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj);  

	}

}
