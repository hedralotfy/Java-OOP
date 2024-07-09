package classes_and_objects_exercises.Inheritance.web_exercises.shape_area;

public class Rectangle extends Shape{

	//Here, we will use the constructor to
	// set the values of a and b.
	
	//When we want to calculate a value based on
	// variables, we often use constructor to
	// pass values to them.
	Rectangle(double a, double b){
		super(a, b);
	}
	
	//Here, we override the getArea() method of class Rectangle.
	public double getArea() {
		double area = a * b;
		return area;
	}

}
