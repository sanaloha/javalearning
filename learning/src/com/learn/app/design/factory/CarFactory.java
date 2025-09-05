package com.learn.app.design.factory;

public class CarFactory extends VehicleFactory{
	
	protected Vehicle create() {
        return new Car();
    }


}
