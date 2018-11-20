package com.bits.Factory;

import com.bits.Vehicle.Vehicle;

public interface VehicleFactory {
	public Vehicle createVehicle(String type,String vehicleNum, String vehicleOwner);

}
