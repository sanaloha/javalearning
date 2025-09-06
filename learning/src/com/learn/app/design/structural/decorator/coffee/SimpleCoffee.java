package com.learn.app.design.structural.decorator.coffee;

public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Simple Coffe";
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return Double.valueOf(5.4);
	}

}
