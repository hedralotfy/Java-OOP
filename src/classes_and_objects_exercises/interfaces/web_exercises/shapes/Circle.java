package classes_and_objects_exercises.interfaces.web_exercises.shapes;

public class Circle implements Shape {
	
	public double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
