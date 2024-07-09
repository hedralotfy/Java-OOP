package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods;

public class Triangle extends Figure{

	/*
	 * Whenever this constructor is invoked,
	 * and the arguments are passed to the parameters,
	 * the control is passed to it, which means that
	 * its body is to be executed.
	 * 
	 * The execution of the body transfers the control
	 * to the constructor Figure(double a, double b), which sets the values
	 * of a and b to the arguments passed, then the control is
	 * passed back to the current code, which executes the overridden area() 
	 * method with the values set by Figure(double a, double b) constructor. 
	 */
	Triangle(double a, double b){
		//Invoking the instructor of Figure class
		// explicitly
		super(a,b);
	}
	
	double area() {
		System.out.println("Inside the area of a triangle.");
		return a * b / 2;
	}
}
