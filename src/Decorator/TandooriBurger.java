package Decorator;

public class TandooriBurger extends Burger {

	@Override
	public String getDessription() {
		return "Tandoori Burger";
	}

	@Override
	public double getCost() {
		return 200.0;
	}
}