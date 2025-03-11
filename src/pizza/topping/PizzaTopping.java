package pizza.topping;

import pizza.MenuItem;

/**
 * {@code PizzaTopping} represents all possible toppings that can go on a pizza
 */
public abstract class PizzaTopping implements MenuItem {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Topping: " + this.toString() + " $" + this.getPrice();
	}

	@Override
	public Double getPrice() {
		return 1.50;
	}

}
