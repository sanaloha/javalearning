package com.learn.app.design.structural.decorator.coffee;

public class MilkCoffee extends CoffeeDecorator{

	public MilkCoffee(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription() {
		return coffee.getDescription()+"Milk Flavaour ";
	}
	
	public Double getCost() {
		return coffee.getCost()+ Double.valueOf(3.0);
	}

}
