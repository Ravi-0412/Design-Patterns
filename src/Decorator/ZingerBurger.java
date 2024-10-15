package Decorator;

public class ZingerBurger extends Burger {

	@Override
	public String getDessription() {
		return "Zinger Burger";
	}

	@Override
	public double getCost() {
		return 180.0;
	}

}
