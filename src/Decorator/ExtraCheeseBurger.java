package Decorator;

public class ExtraCheeseBurger extends BurgerDecorator {
	
	// extracheese or extraMayo has no meaning without a burger
	// so we need one burger object to tell which type of burger we want and add these extra thing
	
	private Burger burger;
	
	public ExtraCheeseBurger(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getDessription() {
		return burger.getDessription() + "with extra cheese ";
	}
	
	@Override
	public double getCost() {
		return burger.getCost() + 10.0;
	}

}
