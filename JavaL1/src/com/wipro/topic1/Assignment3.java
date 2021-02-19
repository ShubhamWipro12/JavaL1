package com.wipro.topic1;

public class Assignment3 {

	public static void main(String[] args) {
		
		int min = 123783;
		
		int year = min / 525600;
		int remainingMinutes = min % 525600;
		int day = remainingMinutes / 1440;
	    
	    System.out.println("Year = "+year+", day = "+day);
	}

}
