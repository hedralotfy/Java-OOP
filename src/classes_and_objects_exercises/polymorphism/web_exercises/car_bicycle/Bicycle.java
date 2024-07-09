package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle;

public class Bicycle extends Vehicle {
	
	Bicycle(int velocity, double time){
		super(velocity, time);
	}
	
	@Override
	public void speedUp() {
		System.out.println("The speed of the bicycle is " + 2 * velocity * time);
	}

}
