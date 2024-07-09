package classes_and_objects_exercises.polymorphism.web_exercises.circle_rect_tri;

public class Demo {

	public static void main(String[] args) {
		Shape c = new Circle(4.1);
		Shape r = new Rectangle(1.2, 3.8);
		Shape t = new Triangle(1,2,3);
		
		System.out.println("Circle's area is " + c.calculateArea());
		System.out.println("Rectangle's area is " + r.calculateArea());
		System.out.println("Triangle's area is " + t.calculateArea());

	}

}
