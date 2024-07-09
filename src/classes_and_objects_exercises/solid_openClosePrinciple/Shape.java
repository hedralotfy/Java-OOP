package classes_and_objects_exercises.solid_openClosePrinciple;

public class Shape {

	/*
	 * This method should have parameter of type Shape.
	 * It should calculate the only area of any of the shapes,
	 * whether it was a circle or a rectangle.
	 */
	public double calculateArea(Shape shape) {
        double area = 0;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                area += Math.PI * Math.pow(circle.getRadius(), 2);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth() * rectangle.getHeight();
            }
            // Add more conditions for other shapes (e.g., Triangle)
        
        return area;
    }
}
