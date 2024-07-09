package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods.web_exercise.area_perimeter;

public class Circle extends Shape {

	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	double calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.print("Area of the circle is pi * radius * radius = ");
		return area;

	}

	@Override
	double calculatePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		System.out.print("Perimeter of the circle is 2 * pi * radius = ");
		return perimeter;

	}

}
