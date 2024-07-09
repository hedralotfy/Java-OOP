package classes_and_objects_exercises.interfaces.web_exercises.shapes;

public class Rectangle implements Shape{

	public double dim1;
	public double dim2;
	
	Rectangle(int dim1, int dim2){
		
		this.dim1 = dim1;
		this.dim2 = dim2;
	}	
	
	@Override
	public double getArea() {
		return dim1 * dim2;
	}
}
