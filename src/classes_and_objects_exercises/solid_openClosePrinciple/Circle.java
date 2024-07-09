package classes_and_objects_exercises.solid_openClosePrinciple;

public class Circle extends Shape {
	
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
	public double calculateArea(Shape shape) {
    	double area = 0;
        	Circle circle = (Circle) shape;
            area += Math.PI * Math.pow(circle.getRadius(), 2);
        
        return area;
		
	}

}
