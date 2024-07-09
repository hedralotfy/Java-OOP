package classes_and_objects_exercises.solid_openClosePrinciple;

import java.util.List;

public class ShapeCalculator {

	/*
	 * This code needs to be modified to calculate the area of additional shapes
	 * so, it's not open for extension nor closed for modification.
	 */
	public double calculateTotalArea(List<Shape> shapes) {
		double totalArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                totalArea += rectangle.getWidth() * rectangle.getHeight();
            }
            // Add more conditions for other shapes (e.g., Triangle)
        }
        return totalArea;
	}
}
