package com.innovator.learnit.OOP.inheritance;

public class Phone extends Product {

	// Default constructor
	/*
	 * To create child object, JVM invokes constructors of all parent classes, to do
	 * this, we will use `super` keyword for explicitly calling the constructor of
	 * parent class and pass String argument to it.
	 * 
	 * In the child constructor, there should not be any line of code preceding the
	 * call of parent class.
	 */
	public Phone() {
		super("Nokia");
		System.out.println("Some code");
	}

	public void ring() {
		System.out.println("Ring!");
	}

	@Override
	public Product[] listVariants() {
		// This exception indicates that this behavior is
		// not supported in this class.
		throw new UnsupportedOperationException();
	}

	public int calculateAmountOfVariants() {
		// method of Object Product will be called.
		// and program will stop execution because
		// of this exception.
		// To stop this exception from happening,
		// I should use the `super` keyword, which
		// refers to the parent class.
		return super.listVariants().length;
	}

}
