package com.innovator.learnit.OOP.staticKeyword;

//this statement imports all static elements from class Arrays like: methods, fields, etc... .
import static java.util.Arrays.*;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Here, the counter will be incremented by 1 in the copy of the User class
		 * user1 and its value will be reserved.
		 */
		User user1 = new User();
		System.out.println("user1.getId() = " + user1.getId());
		System.out.println("user1.getCounter() = " + user1.getCounter());

		System.out.println();
		System.out.println("================================");
		System.out.println();

		/*
		 * Here, the counter will be incremented by 1 in the copy of User class user2
		 * and its value will be reserved.
		 */
		User user2 = new User();
		System.out.println("user2.getId() = " + user2.getId());
		System.out.println("user2.getCounter() = " + user2.getCounter());

		System.out.println();
		System.out.println("================================");
		System.out.println();

		/*
		 * The counter will be incremented by 1 in the same copy user1 of class User and
		 * its value will be reserved.
		 * 
		 * Each time the object is created, the counter will be incremented.
		 * 
		 * After user2 class object is created, counter value is incremented.
		 * 
		 * Since object user2 is the latest object created, when the method
		 * getCounter() of class object user1 is called, like this user1.getCounter(),
		 * the latest value of counter will be returned, which is 2.
		 */
		System.out.println("user1.getCounter() = " + user1.getCounter());
		System.out.println();

		User user1_1 = new User();
		System.out.println("user1_1.getCounter() = " + user1_1.getCounter());
		System.out.println();

		System.out.println("user1.getCounter() = " + user1.getCounter());
		System.out.println();

		System.out.println("================================");
		System.out.println();

		//If I have a variable of type User, the static method
		// of the class will be invoked.
		User user3 = new Employee();
		//If I really want to access the static method of a class
		//I should access it in a static way, which means writing the
		// name of the class before calling the method.
		user3.doAnyStaticAction();

		User.doAnyStaticAction();
		Employee.doAnyStaticAction();

		System.out.println();
		System.out.println("================================");
		System.out.println();

		int[] arr = { 1, 2, 3 };
		// This is the using of sort method before
		// importing static entities from Arrays class.
		Arrays.sort(arr);

		// This is the using of sort method after
		// importing static entities from Arrays class.
		sort(arr);
	}

}
