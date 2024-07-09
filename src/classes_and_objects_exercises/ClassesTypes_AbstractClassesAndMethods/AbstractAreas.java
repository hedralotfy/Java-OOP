package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods;

public class AbstractAreas {

	public static void main(String[] args) {

//		Figure f = new Figure(10, 10);  it's illegal to instantiate abstract class object.

		Triangle t = new Triangle(10, 10);
		Rectangle r = new Rectangle(10, 10);

		/*
		 * It's ok to declare a reference variable of type Figure which is used to refer
		 * to objects of any class derived from Figure.
		 */
		Figure figref;
		
		figref = t;
		System.out.println("Area is " + figref.area());
		figref = r;
		System.out.println("Area is " + figref.area());

		t = new Triangle(10, 20);
		
		System.out.println("Area is " + t.area());
	}

}
