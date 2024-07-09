package classes_and_objects_exercises.Inheritance.web_exercises.person_employee2;

public class PersonEmployeeDemo {

	public static void main(String[] args) {
		Employee emp = new Employee("Hedra","Lotfy",7777,"Software Developer");
		Employee emp2 = new Employee("Jhonathan","Fayez",3737,"Medical Data Analysit");
		
		//Here getFirstName() is not a method in Employee class, but since it inherited
		//the method from Person class, we can call the method through the class object emp and emp2.
		System.out.println(emp.getFirstName() + " " + emp.getLastName() + " (" + emp.getEmployeeId() + ")");
		System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " (" + emp2.getEmployeeId() + ")");

	}

}
