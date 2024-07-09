package com.innovator.learnit.OOP.staticKeyword;

public class User {

	//Here, this field is initialized once in this class, because of the
	// static keyword and its value won't be changed because of final keyword.
	public static final String DEFAULT_USER_GROUP = "customers";
	
	private static int counter;
	
	private int id;
	private String name;
	
	{
		//During initialization of each new object, increment counter.
		++counter;
//		DEFAULT_USER_GROUP = "employees";
	}

	public static void doAnyStaticAction() {
		System.out.println("Static method in User class is called.");
	}
	
	public int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		User.counter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
