package classes_and_objects_exercises.aminal_abstraction;

abstract class Animal {
	
	int age;
	String sex;
	double weight;
	
	/*
	 * int age, String sex, double weight
	 */
	
	Animal(int age, String sex, double weight){
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	
	abstract int findAge();
	abstract String tellSex();
	abstract double findWeight();

}
