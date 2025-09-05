package com.learn.app.design.factory;

public abstract class VehicleFactory {
	
	public Vehicle createVehicle() {
        Vehicle vehicle = create();
        vehicle.build();
        return vehicle;
    }

	
	protected abstract Vehicle create();


}
