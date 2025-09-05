package com.learn.app.design.factory;

public class MotorCycleFactory extends VehicleFactory{
	
	protected Vehicle create() {
        return new MotorCycle();
    }


}
