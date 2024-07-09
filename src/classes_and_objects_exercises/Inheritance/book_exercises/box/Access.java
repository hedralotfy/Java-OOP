package classes_and_objects_exercises.Inheritance.book_exercises.box;

public class Access {

	public static void main(String[] args) {
		BoxWeight bw1 = new BoxWeight(12, 10, 9, 30);
		BoxWeight bw2 = new BoxWeight(10, 10, 10, 30);
		double vol;
		
		vol = bw1.volume();
		System.out.println("Volume of bw1 is " + vol);
		System.out.println("Its weight is " + bw1.weight);
		
		System.out.println();
		
		vol = bw2.volume();
		System.out.println("Volume of bw2 is " + vol);
		System.out.println("Its weight is " + bw2.weight);
		
		Box plain = new Box();
		BoxColor coloredB1 = new BoxColor(10, 11, 12, "Blue");
		
		//Reference variable color of type BoxColor is 
		// assigned to reference variable plain of type Box.
		
		/*
		 * Types of Box and BoxColor are types of reference variable
		 * - not the type of object it refers to - that determine 
		 * which members can be accessed.
		 * 
		 * When a reference to subclass object is assigned to that of
		 * superclass, the subclass object has access only to parts defined
		 * by superclass, not vice versa.
		 */
		plain = coloredB1;
		
		//This is Ok, because volume() method is in Box class.
		System.out.println("Volume of the plain box is " + plain.volume());
		
		//This is illegal, because the field weight is not defined in
		//Class Box.
//		System.out.println("Weight of the plain box is " + plain.weight);
		
		System.out.println();
		
		System.out.println("Volume of the coloredB1 is " + coloredB1.volume());
		System.out.println("Its color is " + coloredB1.color);
	}

}
