package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle;

public class Car extends Vehicle {
	
	Car(int velocity, double time){
		super(velocity, time);
	}
	@Override
	public void speedUp() {
		System.out.println("Speed of the car is " + 7 * velocity * time);
	}

}
