package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods.web_exercise.area_perimeter;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape circle = new Circle(10);
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculatePerimeter());
		
		Shape triangle = new Triangle(10, 20, 30);
		System.out.println(triangle.calculateArea());
		System.out.println(triangle.calculatePerimeter());

	}

}
