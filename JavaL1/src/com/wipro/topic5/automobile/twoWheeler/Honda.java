package com.wipro.topic5.automobile.twoWheeler;

import com.wipro.topic5.automobile.Vehicle;

public class Honda extends Vehicle{

	@Override
	public String modelName() {
		return "YWEO213790";
	}

	@Override
	public String registrationNumber() {
		return "298316";
	}

	@Override
	public String ownerName() {
		return "WQY";
	}
	public int speed(){
		return 80;
	}
	public int cdplayer(){
		return 40;
	}
}
