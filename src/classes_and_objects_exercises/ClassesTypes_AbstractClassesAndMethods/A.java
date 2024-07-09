package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods;

abstract class A {

	// Method declared in abstract should be
	// also abstract.

	/*
	 * Methods, in an abstract class that's extended by sub classes, that are
	 * overridden by subclasses should be declared of type abstract.
	 * 
	 * all subclasses should override the abstract method in an abstract class.
	 */
	abstract void vooFoo();

	void vooFooToo() {
		System.out.println("Amogus concrete method.");
	}

	// Using final here is to prevent overriding the method.
	/*
	 * Methods declared as final can sometimes provide a performance enhancement:
	 * The compiler is free to inline calls to them because it “knows” they will not
	 * be overridden by a subclass.
	 */
	final void met() {
		System.out.println("This is a final method");
	}

}
