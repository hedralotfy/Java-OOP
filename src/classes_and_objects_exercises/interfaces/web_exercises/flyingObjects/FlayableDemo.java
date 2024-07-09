package classes_and_objects_exercises.interfaces.web_exercises.flyingObjects;

public class FlayableDemo {

	public static void main(String[] args) {
		Spacecraft sc = new Spacecraft(27000, "Rockect engine", "Fins and rocket engine");
		Airplane ap = new Airplane(500, "Jet engine", "Wings and Jet engine");
		Helicopter hc = new Helicopter(500, "Turboshaft Engine", "blades");
		
		sc.fly_obj();
		ap.fly_obj();
		hc.fly_obj();

	}

}
