package classes_and_objects_exercises.Inheritance.web_exercises.animal_cat;

public class Animal {
	
	public String sound;
	
	Animal(String sound){
		
		this.sound = sound;
		
	}
	public void makeSound() {
		System.out.println("The sound this animal make is " + sound);
	}

}
