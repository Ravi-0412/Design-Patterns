package StrategyPattern;

public class Vehicle {
	
	//  this is known as constructor injection
	/* sb vehicle apne anusar drive strategy choose kare 
	 iske liye DriveStrategy ka object vehicle ke pass hona chahiye.
	 is object ko constrctor se initialise kar denge (jo bhi strategy pass karenge).
	 jo bhi strategy pass karenge constructor me uska 'drive' wala function call karna hoga.
	 This is known as constructor injection
	 */
	
	DriveStrategy driveObject;
	
	public Vehicle(DriveStrategy driveObj) {
		this.driveObject = driveObj;
	}
	
	public void drive() {
		driveObject.drive();
	}
	
}
