package classes_and_objects_exercises.Inheritance.web_exercises.employee_HR;

public class Employee {
	
	double salary;
	
	Employee(double salary){
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("A working employee.");
	}
	
	public double getSalary() {
		return this.salary;
	}

}
