package classes_and_objects_exercises.polymorphism.web_exercises.employee2;

public class Manager extends Employee {

	public int salary;
	public int bonus;
	
	Manager(String name, int salary, int bonus){
		super(name, "Manager");
		this.salary = salary;
		this.bonus = bonus;
	}
	
	@Override
	public int calculateSalary() {
		return salary + bonus;
	}
	
	public int getSalary() {
		return salary;
	}
	
}
