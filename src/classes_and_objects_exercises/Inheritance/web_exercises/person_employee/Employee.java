package classes_and_objects_exercises.Inheritance.web_exercises.person_employee;

public class Employee extends Person {

	//These 2 variables and work based on them are learned from website.
	public String id;
	public String jobtitle;
	
	Employee(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	public String getFirstName() {
//		System.out.print("FirstName is ");
		return super.getFirstName();
	}
	
	public String getLastName() {
//		System.out.print("LastName is ");
		return super.getLastName();
	}
	
	public void getEmployeeId(String jobTitle) {
		System.out.println("First name is " + getFirstName()
		+ "\nLast name is " + getLastName() + "\nJob title is " + jobTitle);
	}
	
}
