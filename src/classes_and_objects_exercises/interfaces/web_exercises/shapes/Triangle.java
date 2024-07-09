package classes_and_objects_exercises.interfaces.web_exercises.shapes;

public class Triangle implements Shape{
	
	public int dim1;
	public int dim2;
	public int dim3;
	
	public Triangle(int dim1, int dim2, int dim3) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
	}
	@Override
	public double getArea(){
		double s = dim1 + dim2 + dim3 / 2;
		return Math.sqrt(s*(s - dim1) * (s - dim2) * (s - dim3));
	}

}
