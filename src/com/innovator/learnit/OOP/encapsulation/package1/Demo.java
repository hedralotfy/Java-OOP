package com.innovator.learnit.OOP.encapsulation.package1;

import com.innovator.learnit.OOP.encapsulation.package2.ClassB;

public class Demo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		
		/*
		 * This method has default access modifier,
		 * which makes it accessible in the package only.
		 */
		classA.doSomething();
		
		/*
		 * This method has protected access modifier,
		 * which accesses all its elements in the package
		 * or the child class.
		 */
		classA.doSomething2();
		
		ClassB classB = new ClassB();
		
		/*
		 * The method doSomething() from the type ClassA is not visible, since
		 * its access modifier is default.
		 */
//		classB.doSomething();

	}

}
