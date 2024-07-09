package classes_and_objects_exercises;

public class Box {
	/*
	 * type instance-variable1; type instance-variable2; // ... type
	 * instance-variableN;
	 */

	double length;
	double width;
	double height;

	/*
	 * The default constructor assign each instance variable to its default value.
	 * 0, null, false -> numeric types, reference types and boolean types.
	 * 
	 * Once I define my own constructor, I do no longer need default one.
	 * 
	 * Java allows objects to initialize themselves when they are created. This
	 * automatic initialization is performed through the use of constructor.
	 * 
	 * Return type of a class' construction is the class type itself.
	 * 
	 * It's the constructors job to initialize the internal state of the object, so
	 * that the code creating the instance of the object will have an instance of a
	 * fully initialized and usable object immediately.
	 */
	Box() {
		System.out.println("Constructing a box...");
		length = 10;
		width = 10;
		height = 10;
	}

	Box(double length, double width, double height) {
		System.out.println("Constructing a box with constructor...");
		// this keyword will refer to the object that invoked it.
		/*
		 * this lets you refer directly to the object, you can use it to resolve any
		 * namespace collisions that might occur between instance variables and local
		 * variables.
		 */
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
//	Box(double l, double w, double h) {
//		System.out.println("Constructing a box with constructor...");
//		// this keyword will refer to the object that invoked it.
//		/*
//		 * this lets you refer directly to the object, you can use it to resolve any
//		 * namespace collisions that might occur between instance variables and local
//		 * variables.
//		 */
//		this.length = l;
//		this.width = w;
//		this.height = h;
//	}

	/*
	 * type methodname1(parameter-list) { // body of method } type
	 * methodname2(parameter-list) { // body of method } // ... type
	 * methodnameN(parameter-list) { // body of method }
	 */

	/*
	 * Inside this method, instance variables are refered to directly without the
	 * object name or the dot operator.
	 */

	/*
	 * The variables in this method implicitly refers to the copies of the variables
	 * found in the object that invokes the method.
	 */
	public void findVolume() {

//		System.out.println("Volume is ");
		System.out.println(length * width * height);
	}

	double volume() {
		return length * width * height;
	}

//	We going to replace the setDim method with the constructor in coming codes.
	void setDim(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
}
