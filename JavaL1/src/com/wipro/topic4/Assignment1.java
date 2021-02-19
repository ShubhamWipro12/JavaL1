package com.wipro.topic4;

public class Assignment1 {
	
	static int num = (int)(Math.random()*10);
	
	public static void main(String[] args) {

		Assignment1 obj = new Assignment1();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				obj.generateNum();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				obj.GetFact();
			}
		});
		
		t1.start();
		t2.start();
	}
	protected void generateNum() {
		
		System.out.println("Number :"+num);
		
	}

	protected void GetFact() {
	
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of "+num+" : "+fact);
	}
}
