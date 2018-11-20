package com.bits.Vehicle;


public class FourWheelerVehicle implements Vehicle {

	private String vehicleNum;
	private String vehicleOwner;

	public FourWheelerVehicle(String vehicleNum, String vehicleOwner) {
		super();
		this.vehicleNum = vehicleNum;
		this.vehicleOwner = vehicleOwner;

	}

	public String getVehicleNumber() {

		return this.vehicleNum;
	}

	public String getVehicleOwner() {

		return this.vehicleOwner;
	}

	public String getVehicleType() {
		
		return "FourWheeler";
	}

}
