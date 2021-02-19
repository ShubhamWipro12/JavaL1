package com.wipro.topic1;

public class Assignment5 {

	public static void main(String[] args) {
		
		int num = 3629;
		
		int sum = 0;
		while(num!=0){
			sum += (num % 10);
			num /= 10;
		}
		System.out.println(sum);
	}

}
