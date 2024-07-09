package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle2;

public class Car extends Vehicle {

	@Override
	public void speedUp() {
		super.speedUp();
		System.out.println("Car's speed increased by 22 units.");
	}
}
