package classes_and_objects_exercises.polymorphism.web_exercises.circle_rect_tri;

public class Rectangle extends Shape {
	
	public double dim1;
	public double dim2;
	
	Rectangle(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	@Override
	public double calculateArea() {
		return dim1 * dim2;
	}

}
