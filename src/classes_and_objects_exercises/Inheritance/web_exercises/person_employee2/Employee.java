package classes_and_objects_exercises.Inheritance.web_exercises.person_employee2;

public class Employee extends Person {

	//These 2 variables and work based on them are learned from website.
		public int id;
		public String jobtitle;
		
		Employee(String firstName, String lastName, int id, String jobtitle){
			super(firstName, lastName);
			this.id = id;
			this.jobtitle = jobtitle;
		}
		
		
		public String getLastName() {
			return super.getLastName() + ", " + this.jobtitle;
		}
		
		public int getEmployeeId() {
			return this.id;
		}
}
