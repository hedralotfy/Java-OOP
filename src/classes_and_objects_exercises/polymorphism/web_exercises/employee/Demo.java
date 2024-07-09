package classes_and_objects_exercises.polymorphism.web_exercises.employee;

public class Demo {

	public static void main(String[] args) {
		Employee m = new Manager(100000);
		Employee p = new Programmer(30000);
		
		System.out.println("Salaries of employees are as follows: ");
		
		m.getRole();
		System.out.println("("+m.calculateSalary()+")");
		
		p.getRole();
		System.out.print("("+p.calculateSalary()+")");

	}

}
