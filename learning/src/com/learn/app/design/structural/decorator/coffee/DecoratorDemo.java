package com.learn.app.design.structural.decorator.coffee;

/***
 * 
 * Decorator Pattern can be used to dynamically enhance the functionality
 * of objects while keeping the design modular and maintainable.
 * */
public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee simpleCoffee = new SimpleCoffee();
		simpleCoffee = new MilkCoffee(simpleCoffee);
		
		//TODO: Add Sugar Decorator

	}

}
