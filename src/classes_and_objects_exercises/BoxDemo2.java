package classes_and_objects_exercises;

public class BoxDemo2 {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		// initialize each box
		
		/*
		 * When mybox1.setDim(10, 20, 15); is executed,
		 * 10 is copied into parameter l, 20 is copied into w,
		 * and 15 is copied into h.
		 */
		mybox1.setDim(10, 20, 15);
		/*
		 * When mybox2.setDim(3, 6, 9); is executed,
		 * 3 is copied to parameter l, 6 is copied to parameter w,
		 * 9 is copied to parameter h.
		 * Inside setDim the values are then set to length, width
		 * and height.
		 */
		mybox2.setDim(3, 6, 9);
		// get volume of first box
		
		/*
		 * For volume() method it should be always assigned to
		 * a variable, not be put lonely in a sentence.
		 */
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);

		
	}

}
