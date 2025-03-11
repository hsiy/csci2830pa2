package pizza.crust;

/**
 * {@code ThickCrust} represents thick pizza crusts.
 */
public class ThickCrust extends PizzaCrust {
	/**
	 * Thick crust pizza has a deep dish option.
	 */
	private Boolean isDeepDish;
	
	@Override
	public String toString() {
		return "Thick Crust";
	}
	
	@Override
	public String toNiceString() {
		return super.toNiceString() + (this.isDeepDish? " (Deep Dish)" : "");
	}

	
	public Boolean getIsDeepDish() {
		return this.isDeepDish;
	}
	
	public void setIsDeepDish(Boolean isDeepDish) {
		this.isDeepDish = isDeepDish;
	}
	
	/**
	 * Cauliflower crusts may fall apart if not handled carefully, especially for thick crusts.
	 * Issue a warning.
	 */
	@Override
	public String checkIntegrity() {
		return this.ingredient.equalsIgnoreCase("Cauliflower")? 
					"Handle carefully: crust might fall apart" : 
					super.checkIntegrity();
	}
}
