package classes_and_objects_exercises;

public class BoxDemo4 {

	public static void main(String[] args) {

		//Values 3, 4 and 5 are passed to the box constructor
		// when new creates the object.
		Box myBox1 = new Box(3,4,5);
		Box myBox2 = new Box(20, 20, 20);
		double vol;
		
		vol = myBox1.volume();
		System.out.println("Volume of the first contructed box is " + vol);
		
		vol = myBox2.volume();
		System.out.println("Volume of the second contructed box is " + vol);

	}

}
