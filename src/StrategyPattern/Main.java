package StrategyPattern;

public class Main {
	
	public static void main(String[] args) {
		
//		Vehicle vehicle = new SportsVehicle();  // will assign the sport strategy to this vehicle.
		Vehicle vehicle = new OffRoadVehicle();
		vehicle.drive();
	}

}
