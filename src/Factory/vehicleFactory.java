package Factory;

public class vehicleFactory {
	
	public static vehicle getVehicle(String vehicleType) {
		vehicle Vehicle = null;  // we need to create object based on 'vehicleType'.
		
		if(vehicleType.equals("car")) {
			Vehicle = new car();
		}
		else if(vehicleType.equals("bike")) {
			Vehicle = new bike();
		}
		
		return Vehicle;
	}
}
