package com.learn.app.design.creational.factory;

public abstract class VehicleFactory {
	
	public Vehicle createVehicle() {
        Vehicle vehicle = create();
        vehicle.build();
        return vehicle;
    }

	
	protected abstract Vehicle create();


}
