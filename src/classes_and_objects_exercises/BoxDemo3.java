package classes_and_objects_exercises;

public class BoxDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		double vol;
		
		vol = myBox1.volume();
		System.out.println("Volume of the first box is " + vol);
		
		vol = myBox2.volume();
		System.out.println("Volume of the second box is " + vol);

	}

}
