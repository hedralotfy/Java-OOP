package classes_and_objects_exercises.aminal_abstraction;

import java.math.BigDecimal;

abstract class Canine extends Mammal {

	String[] huntingSkills;
	BigDecimal tailLength;

	Canine(String[] huntingSkills, BigDecimal tailLength, int age, String sex, double weight, int litterSize,
			double gestationPeriod) {
		super(age, sex, weight, litterSize, gestationPeriod);
		this.huntingSkills = huntingSkills;
		this.tailLength = tailLength;
	}

	abstract String[] getSkills();

	abstract BigDecimal findTailLength();
}
