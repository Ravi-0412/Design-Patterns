package Decorator;

public class Driver {
	
	public static void main(String[] args) {
		
		Burger burger = new ZingerBurger();
		
//		Burger burger1 = new TandooriBurger();
		
		System.out.println(burger.getDessription() + " " + burger.getCost());
		
//		burger = new ExtraCheeseBurger(burger);
//		System.out.println(burger.getDessription() + " " + burger.getCost());
		
		burger = new ExtraMayoBurger(burger);
		System.out.println(burger.getDessription() + " " + burger.getCost());
		
		// Note: extra cost of cheese and mayo will get added on burger that we will choose
		// so final = 220.
		
		// if you don't want extra cheese then comment that function and you will get
		// burger cost + extra mayo = 210
		
	}

}
