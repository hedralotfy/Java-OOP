package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods.web_exercise.animal_sounds;

public class Tiger extends Animal {
	
	String sound;
	
	void sound(String sound) {
		this.sound = sound;
		System.out.println("Tiger's sound is " + this.sound);
	}

}
