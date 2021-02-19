package com.wipro.topic3;

public class Assignment4 {

	public static void main(String[] args) {
		
		String str1 = "malayalam";
		boolean isPalindrome = true;
		for (int i = 0, j = str1.length()-1; i < str1.length(); i++, j--) {
			if(str1.charAt(i) != str1.charAt(j)){
				isPalindrome = false;
				System.out.println(str1+ "is Not Palindrome.");
				break;
			}
		}
		if(isPalindrome)
			System.out.println(str1+" is a Palindrome String.");
	}

}
