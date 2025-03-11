package pizza.crust;

import pizza.MenuItem;

/**
 * {@code PizzaCrust} represents all possible pizza crusts
 */
public abstract class PizzaCrust implements MenuItem {
	/**
	 * {@code ingedient} represents the base ingredient for the crust.
	 * For simplicity, we use a string rather than adding a class hierarchy of ingredients.
	 */
	protected String ingredient;
	
	public PizzaCrust() {
		this.ingredient = "";
	}
	
	public abstract String toString(); 

	/**
	 * For pizza crusts, output the ingredient in addition to the type.
	 */
	public String toNiceString() {
		return "Crust: " + this.toString() + " (" + this.ingredient + ") $" + this.getPrice();
	}
	
	public String getIngredient() {
		return this.ingredient;
	}
	
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	/**
	 * Provides instructions/warning (if applicable) for handling the pizza based on crust.
	 * @return empty string by default unless specific instructions are needed.
	 */
	public String checkIntegrity() {
		return "";
	}
	
	@Override
	public Double getPrice() {
		return 3.0;
	}

}
