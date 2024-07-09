package classes_and_objects_exercises.Inheritance.web_exercises.animal_cat;

public class InheritanceDemo {

	public static void main(String[] args) {

		/*
		 * Here we created an object of type animal, we called the constructor
		 * Cat(String sound), Which has the call to the parent constructor, in the
		 * parent constructor, values will be passed, then the control will be given
		 * back to the code of Cat class object, then the overridden makeSound() method
		 * in Cat class object will be executed and the original method body will be
		 * ignored.
		 */
		Animal a = new Cat("Meow");

		a.makeSound();

	}

}
