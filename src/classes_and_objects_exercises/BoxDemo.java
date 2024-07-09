package classes_and_objects_exercises;

public class BoxDemo {

	public static void main(String args[]) {
		// A box object is created.
		/*
		 * When a variable of type Box is declared, it's not defining an object but
		 * referring to it.
		 * 
		 * If we want to acquire a physical copy of the object, we should assign it to
		 * the variable using the `new` keyword (as it dynamically allocates a place in
		 * memory and returns a reference to it) then the type of the object followed by
		 * parenthesis (which is the constructor and this is a default constructor
		 * that's created by Java, as there was no one was explicitly specified).
		 * 
		 * The reference is the address in memory for the object allocated by `new`.
		 */

		Box myBox0; // declares reference to the object.

		// class-var = new classname ( );
		myBox0 = new Box(); // allocate a Box object.

		/**
		 * Object reference do not point to an arbitrary memory location or manipulate
		 * it like an integer.
		 */

		// classname class-var = new classname ( );
		Box myBox = new Box();
		double vol;

		myBox.height = 100;
		myBox.length = 120;
		myBox.width = 90;

		System.out.println("Volume of the box is " + (myBox.height * myBox.length * myBox.width));
		System.out.print("Volume of the box using void findVolume is ");

		/*
		 * When myBox.findVolume() is executed, Java run-time transfers control to the
		 * code in the method. After the statements inside volume( ) have executed,
		 * control is returned to the calling routine, and execution resumes with the
		 * line of code following the call.
		 * 
		 * This method is always invoked relative to the object of its class, when this
		 * invocation occurs, the object is known, thus there's no need to specify the
		 * object in the method a second time.
		 */
		myBox.findVolume();
		
		//This variable is assigned to value returned by volume() method
		// relative to object myBox of Box class.
		vol = myBox.volume();
		System.out.println("Volume of the box using volume method is " + vol);
		
		Box myBox2 = new Box();
		myBox2.height = 10;
		myBox2.length = 20;
		myBox2.width = 25;

		System.out.println("Volume of the 2nd box is " + (myBox2.height * myBox2.length * myBox2.width));
		System.out.print("Volume of the 2nd box using void findVolume is ");

		/*
		 * When myBox2.findVolume() is executed, Java run-time transfers control to the
		 * code in the method.
		 */
		myBox2.findVolume();
		vol = myBox2.volume();
		System.out.print("Volume of the 2nd box using void volume method is " + vol);

		/*
		 * Here myBox3 and myBox2 are referencing to the same object in memory, which
		 * means that new space in memory isn't allocated to myBox3.
		 * 
		 * When I assign object reference variable to another object reference variable,
		 * like that I've created a copy of the reference.
		 */
		Box myBox3 = myBox2;

		// Now myBox2 is referring to null, but myBox3 is referring to the original
		// object.
		myBox2 = null;

	}
}
