package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle;

public class Demo {

	public static void main(String[] args) {
		Vehicle c = new Car(200, 2.5);
		Vehicle b = new Bicycle(200, 2.5);

		c.speedUp();
		b.speedUp();
	}

}
