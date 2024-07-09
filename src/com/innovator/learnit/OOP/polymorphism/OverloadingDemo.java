package com.innovator.learnit.OOP.polymorphism;

class Overload{
	public int summation(int a, int b) {
		return a + b;
	}
	
	public double summation(double a, double b) {
		return a + b;
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Overload ol = new Overload();

		//The first call is invoking the first summation method, before overloading
		// which is indicated by 2 int values.
		System.out.println("Result of summation method " + ol.summation(1,2));
		
		//The second call is invoking the overloaded summation method, after overloading
		// which is indicated by 2 double values.
		System.out.println("Result of summation method overloaded " + ol.summation(1.2, 2.4));
	}

	
}
