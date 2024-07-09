package classes_and_objects_exercises.Inheritance.web_exercises.animal_cat2;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		/*
		 * Here the code is very simple, instantiation of objects
		 * of both classes happened.
		 * Then calling the makeSound() method in both of them took place.
		 */
		Animal a = new Animal();
		
		Cat c = new Cat();
		
		a.makeSound();
		c.makeSound();

	}

}
