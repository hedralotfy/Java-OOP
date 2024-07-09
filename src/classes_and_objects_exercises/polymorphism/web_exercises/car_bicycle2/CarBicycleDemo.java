package classes_and_objects_exercises.polymorphism.web_exercises.car_bicycle2;

public class CarBicycleDemo {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();

		/*
		 * The idea of this class is that it gets the speed of each vehicle, then it
		 * calls the speedUp() method in the parent class Vehicle, which increments the
		 * speed value by 10 then says that Car's or Bicycle's speed incremented by 22
		 * or 12 units.
		 * 
		 * After the speed of them both is increased by 10, we get the current speed of
		 * both vehicles.
		 */
		Vehicle c = new Car();
		Vehicle b = new Bicycle();

		System.out.println("Car's initial speed is " + c.getSpeed());
		System.out.println("Bicycle's initial speed is " + b.getSpeed());

//		v.speedUp();
		c.speedUp();
		b.speedUp();

		System.out.println("Car's speed now is " + c.getSpeed());
		System.out.println("Bicycle's speed is " + b.getSpeed());

	}

}
