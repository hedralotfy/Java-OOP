package classes_and_objects_exercises.polymorphism.web_exercises.employee2;

public class Demo {

	public static void main(String[] args) {
		Employee m = new Manager("Hedra Lotfy", 4000, 200);
		Employee p = new Programmer("Karas Lotfy", 2000, 70);
		
		System.out.println("Name: "+ m.getName()+"\nRole: " + m.getRole()
		+"\nSalary with bonus: " + m.calculateSalary() +"\n");
		
		System.out.println("Name: "+ p.getName()+"\nRole: " + p.getRole()
		+"\nSalary with overtime payment: " + p.calculateSalary());

	}

}
