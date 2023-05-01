package com.tns.factorypattern;

public class Bike extends Vehicle {
	int Wheel;
	Bike(int Wheel){
		this.Wheel = Wheel;
		
	}
	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return this.Wheel;
	}

}
