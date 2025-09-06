package com.learn.app.design.creational.factory;

public class MotorCycleFactory extends VehicleFactory{
	
	protected Vehicle create() {
        return new MotorCycle();
    }


}
