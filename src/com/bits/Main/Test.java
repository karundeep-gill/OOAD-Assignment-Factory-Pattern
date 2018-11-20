package com.bits.Main;

import com.bits.Factory.VehicleFactory;
import com.bits.Factory.VehicleFactoryimpl;
import com.bits.Vehicle.Vehicle;

public class Test {

	public static void main(String... s) {
		
				
		VehicleFactory vehicleFactory = new VehicleFactoryimpl();
		Vehicle vehicle = vehicleFactory.createVehicle("Bike", "UP14 CU 5421", "Pankaj Sachdeva");
		 
			System.out.println(vehicle.getVehicleType());
			 vehicle = vehicleFactory.createVehicle("Car", "UP14 CU 5421", "Pankaj Sachdeva");
				System.out.println(vehicle.getVehicleType());
			
		}
	}

