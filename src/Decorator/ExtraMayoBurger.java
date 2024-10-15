package Decorator;

public class ExtraMayoBurger extends BurgerDecorator {
	
	private Burger burger;
	
	public ExtraMayoBurger(Burger burger) {
		this.burger = burger;
	}

	public String getDessription() {
		return burger.getDessription() + " with extra mayo ";
	}

	public double getCost() {
		return burger.getCost() + 30.0;
	}

}
