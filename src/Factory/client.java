package Factory;

import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		// jis type ka vehicle client choose karega,
		// hmko usko client ko de dena h
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter vehicle name: ");
		
		String vehicleType = sc.nextLine();
		System.out.print("vehicleType: ");
		System.out.println(vehicleType);
		
		// without factory
		
//		vehicle Vehicle = null;
//		
//		if(vehicleType.equals("car")) {
//			Vehicle = new car();
//		}
//		else if(vehicleType.equals("bike")) {
//			Vehicle = new bike();
//		}
//		
//		Vehicle.createVehicle();
		
		// solving using factory design pattern
		
		vehicle Vehicle = vehicleFactory.getVehicle(vehicleType);
		Vehicle.createVehicle();
		
	}
}
