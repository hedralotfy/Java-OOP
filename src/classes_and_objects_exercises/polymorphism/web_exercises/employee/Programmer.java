package classes_and_objects_exercises.polymorphism.web_exercises.employee;

public class Programmer extends Employee {
	
	Programmer(int salary){
		super.salary = salary;
	}
	
	@Override
	int calculateSalary() {
		return salary;
	}
	
	@Override
	void getRole() {
		System.out.print("Programmer");
	}

}
