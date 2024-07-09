package classes_and_objects_exercises.interfaces;

class Client implements Callback{

	@Override
	public void callBack(int p) {
		
		System.out.println("callback called with " + p);
		
	}
	
	void nonIfaceMeth() {
		 System.out.println("Classes that implement interfaces " +
		 "may also define other members, too.");
		 }
	
}
