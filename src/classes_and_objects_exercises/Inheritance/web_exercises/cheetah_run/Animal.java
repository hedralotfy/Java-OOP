package classes_and_objects_exercises.Inheritance.web_exercises.cheetah_run;

public class Animal {

	public String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public void move(String move) {
		System.out.println("The animal is " + this.name + " and it " + move);
	}
	
	public String getName() {
		return this.name;
	}
}
