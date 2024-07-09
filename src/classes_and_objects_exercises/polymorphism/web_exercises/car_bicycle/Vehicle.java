package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle;

public class Vehicle {
	public int velocity;
	public double time;
	
	Vehicle(int velocity, double time){
		this.velocity = velocity;
		this.time = time;
	}
	public void speedUp() {
		System.out.println("The speed of the vehicle is " + velocity * time);
	}

}
