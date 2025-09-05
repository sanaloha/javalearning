package com.learning;

import java.util.ArrayList;

public class TestAnnotation {
	
	Animal animal = new Animal();
	
	@SuppressWarnings("unchecked")  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		animal.eatSomething();
		
		//subclass version
		Animal animalSub = new Dog();
		animalSub.eatSomething();
		//you cannot call run method of dog as the reference is of Animal class and it doesnot
		//have the run method.
		
		
		
		//create arraylist of objects
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add(57);  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj);  

	}

}
