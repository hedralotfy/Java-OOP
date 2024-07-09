package classes_and_objects_exercises.interfaces.web_exercises.shapes;

public class ShapesDemo {

	public static void main(String[] args) {
		
		Triangle t = new Triangle(1,2,3);
		Rectangle r = new Rectangle(2,5);
		Circle c = new Circle(4);
		
		System.out.println("Area of triangle is " + t.getArea());
		System.out.println("Area of rectangle is " + r.getArea());
		System.out.println("Area of circle is " + c.getArea());

	}

}
