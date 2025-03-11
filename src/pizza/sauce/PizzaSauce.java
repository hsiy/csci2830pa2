package pizza.sauce;

import pizza.MenuItem;

/**
 * {@code PizzaSauce} represents all possible sauces that can go on a pizza
 */
public abstract class PizzaSauce implements MenuItem {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Sauce: " + this.toString() + " $" + this.getPrice();
	}
	
	@Override
	public Double getPrice() {
		return 0.25;
	}
	
}
