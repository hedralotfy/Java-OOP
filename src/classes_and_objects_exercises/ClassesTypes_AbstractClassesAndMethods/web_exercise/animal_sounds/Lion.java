package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods.web_exercise.animal_sounds;

public class Lion extends Animal{

	String sound;
	
	@Override
	void sound(String sound) {
		this.sound = sound;
		System.out.println("Lion's sound is " + this.sound);
	}
	
}
