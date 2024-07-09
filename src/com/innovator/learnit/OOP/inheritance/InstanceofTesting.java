package com.innovator.learnit.OOP.inheritance;

public class InstanceofTesting {

	public static void main(String[] args) {

		Product product = new Phone();
		
		System.out.println(product instanceof Phone);
		
		product = null;
		
		System.out.println(product instanceof Phone);

	}

}
