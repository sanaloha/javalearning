package com.learning;

public class Animal {
	
	@Deprecated  
	void eatSomething() {
		System.out.println("Animal is eating");
	}

}

class Dog extends Animal{
	
	@Override
	void eatSomething() {
		System.out.println("Dog is eating");
	}
	
}
