package com.innovator.learnit.OOP.encapsulation.package2;

import com.innovator.learnit.OOP.encapsulation.package1.ClassA;

public class ClassB extends ClassA {

	void doSomethingB() {
		/*
		 * doSomething2() method is a protected method in ClassA, so it can be inherited
		 * and accessed from ClassA. The element of access modifier protected will be
		 * accessed within the package or the child class, no matter whether the child
		 * class was in or out of the package, but in case it was out of the package, we
		 * will import the package of the parent class with the class itself.
		 */
		doSomething2();
		doSomethingBPrivate();
	}

	// This private method is only accessible in this class.
	private void doSomethingBPrivate() {
	}

}
