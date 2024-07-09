package classes_and_objects_exercises.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {

		Callback client = new Client();
		
		client.callBack(23);
		
		//The reference variable of type Callback
		// can't refer to the method in the Client
		// class object.
		
//		client.nonIfaceMeth(); //Error

		AnotherClient op = new AnotherClient();
		
		client.callBack(90);
		
		//Now the reference of type Callback 
		// is referring to the class object
		// op, which means now it will implement
		// the method in it.
		client = op;
		
		client.callBack(90);
	}

}
