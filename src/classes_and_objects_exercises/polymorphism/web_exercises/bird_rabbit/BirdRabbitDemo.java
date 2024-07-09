package classes_and_objects_exercises.polymorphism.web_exercises.bird_rabbit;

public class BirdRabbitDemo {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Bird();
		Animal c = new Cat();
		
		a.makesSound();
		b.makesSound();
		
		System.lineSeparator();
		
		a.makesSound();
		c.makesSound();

	}

}
