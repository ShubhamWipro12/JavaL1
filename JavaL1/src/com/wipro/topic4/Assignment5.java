package com.wipro.topic4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "ABC", 29101.62);
		Employee e2 = new Employee(102, "BHG", 70899.55);
		Employee e3 = new Employee(103, "UIO", 13819.42);
		Employee e4 = new Employee(104, "MKL", 98071.47);
		Employee e5 = new Employee(105, "TYU", 89821.32);
		
		Set<Employee> empList = new HashSet<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		for (Iterator<Employee> iterator = empList.iterator(); iterator.hasNext();) {
			Employee employee = iterator.next();
			System.out.println(employee.eCode+" "+employee.name+" "+employee.salary);
		}
	}

}
