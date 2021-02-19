package com.wipro.topic4;

import java.util.HashMap;
import java.util.Map;

public class Assignment4 {

	public static void main(String[] args) {
		Map<String, Long> phonebook = new HashMap<String, Long>();
		phonebook.put("QWE", new Long(1234567890));
		phonebook.put("TYU", new Long(1235678904));
		phonebook.put("UIO", new Long(1234567893));
		phonebook.put("MKL", new Long(1823456794));
		phonebook.put("ASD", new Long(1012567892));
		
		String name = "QWE";
		System.out.println(phonebook.get(name));
	}

}
