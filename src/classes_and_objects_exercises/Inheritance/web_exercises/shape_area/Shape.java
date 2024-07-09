package classes_and_objects_exercises.Inheritance.web_exercises.shape_area;

public class Shape {
	
	/*
	 * Here, we declared 2 fields and they will
	 * be used for shapes depending on 2 dimensions.
	 */
	public double a;
	public double b;
	
	/*
	 * We will declare a constructor for setting
	 * the values, this constructor will be used
	 * later.
	 */
	public Shape(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	/*
	 * We declared the getArea() method and it will return 0.0
	 * as a value.
	 */
	public double getArea() {
		return 0.0;
	}

}
