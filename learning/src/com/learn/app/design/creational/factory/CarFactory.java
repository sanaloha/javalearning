package com.learn.app.design.creational.factory;

public class CarFactory extends VehicleFactory{
	
	protected Vehicle create() {
        return new Car();
    }


}
