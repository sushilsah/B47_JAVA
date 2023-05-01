package com.tns.factorypattern;

public class VehicleFactory {
	public static Vehicle getInstance(String type, int Wheel) {
		if(type=="Car") {
			return new Car(Wheel);
		
		}
		else if(type == "bike") 
			return new Bike(Wheel);
			return null;
		}
			
	}

