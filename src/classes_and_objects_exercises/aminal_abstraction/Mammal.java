package classes_and_objects_exercises.aminal_abstraction;

abstract class Mammal extends Animal{

	int litterSize;
	double gestationPeriod;
	
	Mammal(int age, String sex, double weight, int litterSize, double gestrationPeriod){
		super(age, sex, weight);
		this.litterSize = litterSize;
		this.gestationPeriod = gestrationPeriod;
	}
	
	int findAge() {
		return age;
		}
	
	String tellSex() {
		return sex;
	}
	
	double findWeight() {
		return weight;
	}
	
	abstract int findLitter();
	abstract double gestationPeriodFinding(); 
	
}
