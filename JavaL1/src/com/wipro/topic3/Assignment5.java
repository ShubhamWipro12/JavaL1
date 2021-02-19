package com.wipro.topic3;

public class Assignment5 {

	public static void main(String[] args) {

		String str = "How was your day today";
		char ch = 'a';

		System.out.println(countOccrence(str, ch, 0, 0));
	}

	private static int countOccrence(String str, char ch, int position, int count) {
		if (position == str.length())
			return count;
		if(str.charAt(position)==ch)
			return countOccrence(str, ch, ++position, ++count);
		return countOccrence(str, ch, ++position, count);
	}

}
