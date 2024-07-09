package classes_and_objects_exercises.ClassesTypes_AbstractClassesAndMethods.web_exercise.animal_sounds;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal;
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		animal = lion;
		animal.sound("ROAR");
		
		animal = tiger;
		animal.sound("GROWL");

	}

}
