package com.wipro.topic4;

import java.time.LocalTime;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			System.out.println(LocalTime.now());
			Thread.sleep(2000);
		}
	}

}
