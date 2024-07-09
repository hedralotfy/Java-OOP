package classes_and_objects_exercises.Inheritance.book_exercises.box;

public class Box {

	double length;
	double width;
	double height;
	
	//Here we're cloning the Box object.
	Box(Box ob){
		length = ob.length;
		width = ob.width;
		height = ob.height;
	}
	
	Box(){
		//Initializing the fields with
		//-1, in case there's no object initialized.
		length = -1;
		width = -1;
		height = -1;
	}
	
	double volume(){
		return this.length * this.width * this.height;
	}
	
}
