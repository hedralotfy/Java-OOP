package classes_and_objects_exercises.polymorphism.web_exercises.employee2;

public class Programmer extends Employee {
	
	public int salary;
	public int overTimeMoney;
	
	Programmer(String name, int salary, int overTimeMoney){
		super(name, "Programmer");
		this.salary = salary;
		this.overTimeMoney = overTimeMoney;
	}
	
	@Override
	public int calculateSalary() {
		return salary + overTimeMoney;
	}

}
