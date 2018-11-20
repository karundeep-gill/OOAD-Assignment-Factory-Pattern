package com.bits.Factory;
import com.bits.Vehicle.FourWheelerVehicle;
import com.bits.Vehicle.TwoWheelerVehicle;
//2
import com.bits.Vehicle.Vehicle;

public class VehicleFactoryimpl implements VehicleFactory {

	
	public Vehicle createVehicle(String type,String vehicleNum, String vehicleOwner) {
		
		
		if(type.equalsIgnoreCase("Bike")){
			return new TwoWheelerVehicle( vehicleNum, vehicleOwner);
			
		}
		else if(type.equalsIgnoreCase("Car")){
			return new FourWheelerVehicle(vehicleNum, vehicleOwner);
			
		}
		
		return null;
	}

}
