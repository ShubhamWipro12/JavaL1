package com.wipro.topic1;

public class Assignment7 {

	public static void main(String[] args) {
		
		int num = 4;
		System.out.println(findFact(num));
	}

	private static int findFact(int num) {
		return (num == 0 || num == 1)? 1 : num*findFact(num-1);
	}

}
