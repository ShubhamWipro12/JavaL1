package com.wipro.topic1;

public class Assignment6 {

	public static void main(String[] args) {

		int[] arr = { 82, 13, 27, 33, 67 };
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}

}
