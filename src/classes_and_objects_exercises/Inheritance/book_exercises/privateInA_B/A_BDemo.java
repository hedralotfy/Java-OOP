package classes_and_objects_exercises.Inheritance.book_exercises.privateInA_B;

public class A_BDemo {

	public static void main(String[] args) {
		B b = new B();
		
		
		b.setij(1, 2);

		//This method won't be compiled because the field
		// because the field A.j is not visible
//		b.sum();
	}

}
