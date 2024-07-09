package classes_and_objects_exercises.polymorphism.web_exercises.employee;

public class Manager extends Employee {
	
	
	Manager(int salary){
		super.salary = salary;
	}
	
	@Override
	int calculateSalary() {
		return salary;
	}
	
	@Override
	void getRole() {
		System.out.print("Manager");
	}

}
