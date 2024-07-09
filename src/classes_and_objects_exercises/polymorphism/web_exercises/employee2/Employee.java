package classes_and_objects_exercises.polymorphism.web_exercises.employee2;

public class Employee {

	public String name;
	public String role;
	
	Employee(String name, String role){
		this.name = name;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	
	public int calculateSalary() {
		return 0;
	}
}
