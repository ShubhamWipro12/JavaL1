package com.wipro.topic5.automobile.twoWheeler;

import com.wipro.topic5.automobile.Vehicle;

public class Hero extends Vehicle{

	@Override
	public String modelName() {
		return "XAIUGS621793";
	}

	@Override
	public String registrationNumber() {
		return "71382";
	}

	@Override
	public String ownerName() {
		return "BAC";
	}
	public int speed() {
		return 80;
	}
	public void radio(){
		System.out.println("Playing radio");
	}
}
