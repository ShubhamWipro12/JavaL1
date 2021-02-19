package com.wipro.topic3;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		
		if(args.length < 5)
			throw new ArrayIndexOutOfBoundsException("The no. of supplied values must be exactly 5");
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
