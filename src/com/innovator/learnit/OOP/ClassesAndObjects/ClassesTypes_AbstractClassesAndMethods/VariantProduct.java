package com.innovator.learnit.OOP.ClassesAndObjects.ClassesTypes_AbstractClassesAndMethods;

//This is also a child class which extends abstract class.
public class VariantProduct extends Product {
	
	private MasterProduct[] variants;

	@Override
	public boolean isAvailableInStock() {
		for (MasterProduct masterProduct : variants) {
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}
}
