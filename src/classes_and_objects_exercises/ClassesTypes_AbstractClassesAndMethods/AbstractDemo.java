package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods;

public class AbstractDemo {

	public static void main(String[] args) {
		
		/*
		 * No objects of A are declared in our program,
		 * as it's not possible to instantiate an abstract class.
		 */
		B b = new B();
		
		b.vooFoo();
		
		//Concrete methods can be overridden by subclasses too,
		// but it's not a must as that when we override an abstract
		// method should be overridden by all subclasses to an
		// abstract class.
		b.vooFooToo();

	}

}
