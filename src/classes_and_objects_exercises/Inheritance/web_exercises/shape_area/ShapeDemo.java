package classes_and_objects_exercises.Inheritance.web_exercises.shape_area;

public class ShapeDemo {

	public static void main(String[] args) {
		
		/*
		 * Here we instantiate class object of type Rectangle
		 * with the constructor of Rectangle(double a, double b),
		 * which will call the constructor of Shape(double a, double b)
		 */
		Rectangle rc = new Rectangle(1,2);
		
		/*
		 * Now, this method will be overridden, its body in the
		 * child class will be executed, as it's called in the
		 * rc class object and the values are set before in the 
		 * object instantiation.
		 */
		System.out.println("Area of rectangle is " + rc.getArea());

	}

}
