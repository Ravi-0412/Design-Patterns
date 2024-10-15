package StrategyPattern;

public class SportsVehicle extends Vehicle{
	
	public SportsVehicle() {
		super(new SportsDriveStrategy());  // this will initialise the drive strategy with sport.
	}

}
