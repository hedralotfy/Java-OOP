package classes_and_objects_exercises.Inheritance.web_exercises.employee_HR;

public class HRManager extends Employee{
	
	HRManager(double salary){
		super(salary);
	}
	public void work() {
		System.out.println("A working HRMangager.");
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void addEmployee() {
		System.out.println("Employee added.");
	}

}
