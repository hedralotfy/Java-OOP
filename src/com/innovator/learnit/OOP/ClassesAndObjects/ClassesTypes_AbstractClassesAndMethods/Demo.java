package com.innovator.learnit.OOP.ClassesAndObjects.ClassesTypes_AbstractClassesAndMethods;

import com.innovator.learnit.OOP.ClassesAndObjects.Cart;
import com.innovator.learnit.OOP.ClassesAndObjects.Cart.Discount;
import com.innovator.learnit.OOP.ClassesAndObjects.Cart.Tax;

public class Demo {
	public static void main(String[] args) {
		User user = new User();
		System.out.println(user);
		
		User user2 = new User(2000, "Hedra", "Lotfy", "hedralotfy20@gmail.com");
		System.out.println(user2);
//		// === init static nested class
		Tax tax = new Cart.Tax("someTaxType", 0);
//		
//		// === init inner class
		Discount discount = new Cart().new Discount("firstClientDiscount", 0);
		System.out.println(discount);
		// === Abstract class demo
//		Product product = new Product(); // can't create instance of an abstract class
		MasterProduct masterProduct = new MasterProduct();
		VariantProduct variantProduct = new VariantProduct();
		
		masterProduct.setName("Mercedes S-klass");
		variantProduct.setDeliveryAvailable(true);
		System.out.println(masterProduct);
		
		// === Anonymous class demo
		Product product = new Product() {
			@Override
			public boolean isAvailableInStock() {
				return false;
			}
		};
		
	}
}
