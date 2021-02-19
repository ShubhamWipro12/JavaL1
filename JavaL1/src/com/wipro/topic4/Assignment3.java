package com.wipro.topic4;

import java.util.ArrayList;
import java.util.List;

class Employee {

	int eCode;
	String name;
	double salary;

	public Employee(int eCode, String name, double salary) {
		this.eCode = eCode;
		this.name = name;
		this.salary = salary;
	}

	public int geteCode() {
		return eCode;
	}
}

class EmployeeDB{
	List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e){
	
		for (Employee employee : empList) {
			if(employee.geteCode() == e.geteCode())
				return false;
		}
		empList.add(e);
		return true;
	}
	
	public boolean deleteEmployee(int eCode){
		
		for (Employee employee : empList) {
			if(employee.geteCode() == eCode){
				empList.remove(employee);
				return true;
			}
		}
		return false;
	}
	
	public String showPaySlip(int eCode){
		
		for (Employee employee : empList) {
			if(employee.geteCode() == eCode){
				return "Salary Slip of "+eCode+" is "+employee.salary;
			}
		}
		return "No such Employee available, with eCode :"+eCode;
	}
	
	public Employee[] listAll(){
		Employee[] empArr = new Employee[empList.size()];
		
		for (int i = 0; i < empArr.length; i++) {
			empArr[i] = empList.get(i);
		}
		return empArr;
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "ABC", 29101.62);
		Employee e2 = new Employee(102, "BHG", 70899.55);
		Employee e3 = new Employee(103, "UIO", 13819.42);
		Employee e4 = new Employee(104, "MKL", 98071.47);
		Employee e5 = new Employee(105, "TYU", 89821.32);
		
		EmployeeDB db = new EmployeeDB();
		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		db.addEmployee(e4);
		db.addEmployee(e5);
		
		db.deleteEmployee(102);
		System.out.println(db.showPaySlip(104));
		
		for(Employee emp : db.listAll()){
			System.out.println(emp.eCode+" "+emp.name+" "+emp.salary);
		}
		
	}
}
