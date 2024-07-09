package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle2;

public class Bicycle extends Vehicle {

	@Override
	public void speedUp() {
		super.speedUp();
		System.out.println("Bicycle speed increased by 12 units.");
	}
}
