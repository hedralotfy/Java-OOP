package classes_and_objects_exercises.polymorphism.web_exercises.circle_rect_tri;

public class Circle extends Shape{

	public double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
