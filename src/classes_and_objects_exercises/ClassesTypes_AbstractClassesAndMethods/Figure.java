package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods;

abstract class Figure {

	double a;
	double b;
	
	Figure(double a, double b){
		
		this.a = a;
		this.b = b;
		
		//area is now an abstract method
		//that should be implemented in 
		// all child classes.
	}
	abstract double area();
}
