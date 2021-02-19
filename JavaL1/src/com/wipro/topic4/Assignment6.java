package com.wipro.topic4;

class A1 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
}

public class Assignment6 {

	public static void main(String[] args) {

		A1 a1 = new A1();
		a1 = new A1();
		a1 = new A1();

		Runtime.getRuntime().gc();
	}

}
