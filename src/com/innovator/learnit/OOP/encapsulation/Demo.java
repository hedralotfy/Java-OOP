package com.innovator.learnit.OOP.encapsulation;

import com.innovator.learnit.OOP.encapsulation.package1.ClassA;
import com.innovator.learnit.OOP.encapsulation.package2.ClassC;

public class Demo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();

		/*
		 * Since the method doSomething() is of access modifier default, we will receive
		 * compilation error message: The method doSomething() from the type ClassA is
		 * not visible.
		 */
//		classA.doSomething();

		/*
		 * Since doSomething2() method is of access modifier protected, which means it
		 * can only be accessed in its own package or the the child class, we will
		 * receive the message: The method doSomething2() from the type ClassA is not
		 * visible.
		 */
//		classA.doSomething2();

		ClassC classC = new ClassC();

		/*
		 * Despite the doSomethingB() is of access modifier default in type ClassB,
		 * after ClassC has inherited the method from ClassB and changed its default
		 * access modifier to public, we can now access the method in this class which
		 * is out of the package or even in any other class.
		 */
		classC.doSomethingB();
	}

}
