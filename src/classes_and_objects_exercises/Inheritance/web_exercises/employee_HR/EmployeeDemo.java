package classes_and_objects_exercises.Inheritance.web_exercises.employee_HR;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee em = new Employee(40000);
		HRManager hrm = new HRManager(80000);
		
		em.work();
		System.out.println("Employee's salary is " + em.getSalary());
		
		hrm.work();
		System.out.println("HRManager's salary is " + hrm.getSalary());
		
		hrm.addEmployee();

	}

}
