package classes_and_objects_exercises.polymorphism.web_exercises.circle_rect_tri;

public class Triangle extends Shape {
	
	public double dim1;
	public double dim2;
	public double dim3;
	
	Triangle(double dim1, double dim2, double dim3){
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
	}
	
	@Override
	public double calculateArea() {
		double s = dim1 + dim2 + dim3 / 2;
		return Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
	}

}
