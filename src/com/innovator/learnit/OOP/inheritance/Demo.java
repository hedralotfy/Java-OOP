package com.innovator.learnit.OOP.inheritance;

public class Demo {

	public static void main(String[] args) {

		/*
		 * We initialize a variable of type parent class to the child object, assuming
		 * that `Product` is the parent class and `Phone` class is the child and we want
		 * to create object of class `Phone`.
		 */

		/*
		 * Phone object is also of type Product. product variable has its own methods
		 * that are declared in Product type, that are not declared in Phone but Product.
		 */

		Product product = new Phone();
		/*
		 * Phone object doesn't have the name field, but we can set the value for name
		 * property of the phone, that's by inheriting the name field from Product
		 * object.
		 */
		product.setName("Nokia 1100");
		System.out.println("Product name: " + product.getName());
		System.out.println("Remaining amount in stock: " + product.calculateRemainingAmount());

		/*
		 * We can't call ring() method using the product reference variable, as it's not
		 * defined for type Product.
		 * 
		 * We can't see methods of Phone type, because we have the variable of type
		 * Product.
		 * 
		 * Only when we define a variable of Phone type, we can call the ring() method.
		 */
//		product.ring();

		Phone phone2 = new Phone();
		phone2.ring();

		/*
		 * Here the instanceof operator is a binary operator that allows me to check the
		 * type consistency with the object.
		 * 
		 * It works with 2 operands.
		 * 
		 * instanceof operator is used to test whether the object is an instance of the
		 * specified type (class or subclass or interface). (JavaTPoint)
		 * 
		 * If we apply the instanceof operator with any variable that has null value, it
		 * returns false. (JavaTPoint)
		 * 
		 * In case the variable reference to object is incompatible with the type of the
		 * second operand.
		 * 
		 * Here, in the condition, the return of this operator is true, so in this case,
		 * we will case the product object to type Phone.
		 */
		if (product instanceof Phone) {
			Phone phone3 = (Phone) product;
			phone3.ring();
		}

		System.out.println(phone2.calculateAmountOfVariants());
	}

}
