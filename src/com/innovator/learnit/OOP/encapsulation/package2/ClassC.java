package com.innovator.learnit.OOP.encapsulation.package2;

public class ClassC extends ClassB {

	@Override
	// If I tried to extend the access modifier of the method I won't receive any
	// error message.
	public void doSomethingB() {
	}

//	@Override
//	// If I tried to narrow the access modifier of the original doSomethingB() I
//	// will receive a compilation error message: You cannot reduce the visibility of
//	// the
//	// inherited method from ClassB
//	protected void doSomethingB() {
//	}
}
