package classes_and_objects_exercises.Inheritance.book_exercises.box;

public class BoxWeight extends Box {

	public double weight;

	/*
	 * BoxWeight inherits all of the characteristics of Box and adds to them the
	 * weight component. It is not necessary for BoxWeight to re-create all of the
	 * features found in Box. It can simply extend Box to meet its own purposes.
	 */
	BoxWeight(double l, double wi, double h, double w) {
		length = l;
		width = wi;
		height = h;
		weight = w;
	}

}
