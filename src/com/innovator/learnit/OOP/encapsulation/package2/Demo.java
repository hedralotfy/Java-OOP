package com.innovator.learnit.OOP.encapsulation.package2;

public class Demo {

	public static void main(String[] args) {
		ClassB classB = new ClassB();
		
		/*
		 * Tying to access this method will lead to an error,
		 * because this method is private to class type ClassB.
		 */
//		classB.doSomethingBPrivate();
		
		/*
		 * doSomethingB() method is of default access
		 * modifier, which will 
		 */
		classB.doSomethingB();

	}

}
