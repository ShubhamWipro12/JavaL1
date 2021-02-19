package com.wipro.topic3;

public class Assignment2 {

	public static void main(String[] args) {

		// note: provide the marks out of 100.

		// collect data of student1
		String student1 = args[0];
		int sum = 0;

		for (int i = 1; i < 4; i++) {
			int mark = Integer.parseInt(args[i]);

			if (mark <= 0 || mark >= 100)
				throw new NumberFormatException("Marks must not be less than zero, nor greater than 100");

			sum += mark;
		}
		sum /= 300;

		// collect data of student2
		String student2 = args[4];
		int sum2 = 0;

		for (int i = 5; i < 7; i++) {
			int mark = Integer.parseInt(args[i]);

			if (mark <= 0 || mark >= 100)
				throw new NumberFormatException("Marks must not be less than zero, nor greater than 100");

			sum += mark;
		}
		sum2 /= 300;

		int total = (sum + sum2) / 2;
		System.out.println("Avg. mark of " + student1 + " and " + student2 + " are: " + total);
	}

}
