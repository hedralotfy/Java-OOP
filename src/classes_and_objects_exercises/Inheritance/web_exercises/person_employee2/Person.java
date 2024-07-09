package classes_and_objects_exercises.Inheritance.web_exercises.person_employee2;

public class Person {

	public String firstName;
	public String lastName;
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
}
