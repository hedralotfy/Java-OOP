package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods;

public class Rectangle extends Figure{
	
	Rectangle(double a, double b){
		super(a, b);
	}
	double area() {
		System.out.println("Inside the area of a rectangle.");
		return a * b;
	}

}
