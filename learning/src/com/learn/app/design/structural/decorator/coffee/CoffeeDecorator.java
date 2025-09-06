package com.learn.app.design.structural.decorator.coffee;

public abstract class CoffeeDecorator implements Coffee{
	
	Coffee coffee;
	public String getDescription() {
		return coffee.getDescription();
	}
	
	public Double getCost() {
		return coffee.getCost();
	}
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	

}
