package com.learn.app.design.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleFactory factory = new CarFactory();
        factory.createVehicle(); // Output: Building a Car

        factory = new MotorCycleFactory();
        factory.createVehicle(); // Output: Building a Motorcycle


	}

}
