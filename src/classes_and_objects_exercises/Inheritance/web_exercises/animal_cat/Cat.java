package classes_and_objects_exercises.Inheritance.web_exercises.animal_cat;

public class Cat extends Animal{
	
	Cat(String sound){
		super(sound);
	}
	
	/*
	 * Here, makeSound() method is overridden, but here the method's
	 * body is different from the original. 
	 */
	@Override
	public void makeSound() {
		System.out.println("The cat makes sound of " + sound);
	}
	
}
