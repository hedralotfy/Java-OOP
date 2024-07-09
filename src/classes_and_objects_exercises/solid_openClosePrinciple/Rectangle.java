package classes_and_objects_exercises.solid_openClosePrinciple;

public class Rectangle extends Shape {
	
	private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
   	public double calculateArea(Shape shape) {
       	double totalArea = 0;
           	Rectangle rectangle = (Rectangle) shape;
               totalArea += rectangle.getWidth() * rectangle.getHeight();
           return totalArea;
   		
   	}
    
}
