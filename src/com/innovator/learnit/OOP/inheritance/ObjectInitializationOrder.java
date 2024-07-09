package com.innovator.learnit.OOP.inheritance;

public class ObjectInitializationOrder {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("=====================");
		p = new Child();

		// 1-What will be printed to console when I create
		// child object the first time?

		/*
		 * Static initialization block of parent class is executed first, then static
		 * initialization block of child class.
		 * 
		 * Static blocks are executed when classes uploaded into JVM. JVM is uploaded
		 * first and after that child class was uploaded.
		 * 
		 * After this JVM wants to initialize parent fields first, then the constructor.
		 * 
		 * And only after that, JVM starts to create child object and executes child
		 * initialization block and child constructor.
		 */

		// 2-What will be printed to console when I create
		// child object the second time?

		/*
		 * Everything is executed the same way, except everything static, including
		 * initialization blocks, is associated with is not associated with the object
		 * of this class but with the class itself.
		 * 
		 * So static initialization block is the first to be executed first, then
		 * initialization blocks, after that constructors are to be executed.
		 * 
		 * Element in classes to be executed are the parent class then the child class
		 * respectively.
		 */
	}

}

class Parent {
	static {
		System.out.println("Static init block parent");
	}

	{
		System.out.println("Init block parent");
	}

	public Parent() {
		System.out.println("Parent constructor");
	}

}

class Child extends Parent {
	static {
		System.out.println("Static init block child");
	}

	{
		System.out.println("Init block child");
	}

	public Child() {
		System.out.println("child constructor");
	}
}