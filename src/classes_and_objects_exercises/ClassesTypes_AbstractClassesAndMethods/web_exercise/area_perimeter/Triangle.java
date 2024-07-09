package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods.web_exercise.area_perimeter;

public class Triangle extends Shape {

	public int dim1;
	public int dim2;
	public int dim3;
	
	public Triangle(int dim1, int dim2, int dim3) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim2;
	}
	@Override
	double calculateArea() {
		double s = dim1 + dim2 + dim3 / 2;
		System.out.println("s = dim + dim2 + dim3 / 2");
		System.out.print("Area of triangle is s*(s - dim1) * (s - dim2) * (s - dim3) = ");
		return Math.sqrt(s*(s - dim1) * (s - dim2) * (s - dim3));

	}

	@Override
	double calculatePerimeter() {
		System.out.print("Perimeter of triangle is dim1 + dim2 + dim3 = ");
		return dim1 + dim2 + dim3;

	}

}
