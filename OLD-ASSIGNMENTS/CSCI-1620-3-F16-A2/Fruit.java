// Name	 	: Mikayla Thomas
	// Class 	: Your section of 1620
	// Program # 	: 1
	// Due Date  	: 9-28-2016
	//
	// Honor Pledge:  On my honor as a student of the University
//                of Nebraska at Omaha, I have neither given nor received
//                unauthorized help on this homework assignment.
//
// NAME: Mikayla Thomas
// NUID: 692
// EMAIL: mikaylathomas@unomaha.edu
	
	// Partners:  NONE
	
	// Assignment #2 is a zoo game based on polymorphism
package Zoo.Foods;
import Zoo.*;

public class Fruit extends Food {
	
	public Fruit() {
		super(25,10);
	}
	
	@Override
	public String toString() {
		return String.format("Fruit\n%s",super.toString());
	}
}