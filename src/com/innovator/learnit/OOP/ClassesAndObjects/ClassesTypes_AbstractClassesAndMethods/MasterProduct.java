package com.innovator.learnit.OOP.ClassesAndObjects.ClassesTypes_AbstractClassesAndMethods;

//This is a child class, which is also called concrete class.
public class MasterProduct extends Product {
	
//	public static String name;
//	public static int price;

//	 public MasterProduct() {}
//	 public MasterProduct(String name, int price) {
//		 
//	 }

			@Override
	public String toString() {
		return "MasterProduct [getName()=" + getName() + "]";
	}

			private boolean isAvailableForLease;

			@Override
			public boolean isAvailableInStock() {
				return getRemainingAmountInStock() > 0;
			}
			
}
