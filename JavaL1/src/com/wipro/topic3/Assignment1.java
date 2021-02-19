package com.wipro.topic3;

class AgeException extends Exception {

	public AgeException(String message) {
		System.err.println(message);
	}

}

public class Assignment1 {

	public static void main(String[] args) throws AgeException {

		String name = args[0];
		int age = Integer.parseInt(args[1]);

		if(age <= 18 && age >= 60)
			throw new AgeException("Age can not be less than 18 nor greater than 60.");
		else
			System.out.println("Congrats!! you come under deserved category");
	}

}
