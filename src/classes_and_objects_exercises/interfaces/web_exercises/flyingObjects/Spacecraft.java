package classes_and_objects_exercises.interfaces.web_exercises.flyingObjects;

public class Spacecraft implements Flyable{
	
	int speed;
	String engine;
	String wayToFly;
	
	Spacecraft(int speed, String engine, String wayToFly){
		this.speed = speed;
		this.engine = engine;
		this.wayToFly = wayToFly;
	}
	@Override
	public void fly_obj() {
		System.out.println("Spacecraft has speed of " + speed + " and " + engine + " as its engine"
				+ " and its way to fly is using " + wayToFly + ".");
	}

}
