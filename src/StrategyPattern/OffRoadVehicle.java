package StrategyPattern;

public class OffRoadVehicle extends Vehicle{
	
	public OffRoadVehicle() {
		super(new SportsDriveStrategy());  
		// this will initialise the drive strategy that vehicle require here 'sports'.
	}

}
