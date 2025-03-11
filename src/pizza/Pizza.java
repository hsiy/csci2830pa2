package pizza;
import java.util.ArrayList;
import java.util.Collections;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

/**
 * {@code Pizza} represents a pizza in our application. It holds together all the usual components of pizza like
 * crust, sauce and toppings. For our application, we limit to one crust, one sauce, and multiple toppings.
 */
public class Pizza implements MenuItem {
	private PizzaCrust crust;
	private PizzaSauce sauce;
	private ArrayList<PizzaTopping> toppingList;
	private ArrayList<MenuItem> selectionList;
	
	public Pizza() {
		this.crust = null;
		this.sauce = null;
		this.toppingList = new ArrayList<PizzaTopping>();
		this.selectionList = new ArrayList<MenuItem>();
	}

	public PizzaCrust getCrust() {
		return this.crust;
	}

	/**
	 * In addition to setting crust, setCrust also adds the crust into the selectionList for future displays
	 * @param crust the selected crust
	 */
	public void setCrust(PizzaCrust crust) {
		this.crust = crust;
		this.selectionList.add(crust);
	}

	public PizzaSauce getSauce() {
		return this.sauce;
	}

	/**
	 * In addition to setting sauce, setSauce also adds the sauce into the selectionList for future displays
	 * @param sauce the selected sauce
	 */
	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
		this.selectionList.add(sauce);
	}

	public ArrayList<PizzaTopping> getTopping() {
		return this.toppingList;
	}

	/**
	 * In addition to setting toppings, setTopping also adds the sauce into the selectionList for future displays
	 * @param sauce the selected sauce
	 */
	public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
		this.selectionList.addAll(toppings);
	}

	/**
	 * addTopping appends a new topping to the list of toppings.
	 * @param topping is any valid PizzaTopping
	 */
	public void addTopping(PizzaTopping topping) {
		this.toppingList.add(topping);
		this.selectionList.add(topping);
	}
	
	/**
	 * @return a nicely formatted string describing the pizza
	 */
	public String toNiceString() {
		String nice = "";
		nice = "Pizza: $" + this.getPrice();
		nice += "    " + this.crust.toNiceString();
		nice += "    " + this.sauce.toNiceString();
		for (PizzaTopping t : this.toppingList) {
			nice += "    " + t.toNiceString();
		}
		return nice;
	}

	/**
	 * Display a nicely formatted description of the pizza
	 */
	public void display() {
		System.out.println(this.toNiceString());
	}


	/**
	 * Lists all pizza components
	 */
	public void displayItems() {
		System.out.println("Pizza: $" + this.getPrice());
		for (MenuItem m : this.selectionList) {
			System.out.println("    " + m.toNiceString());
		}
	}

	// @Override
	// public Double getPrice() {
		// Double totalPrice = 0.0;
		// totalPrice += this.crust.getPrice();
		// totalPrice += this.sauce.getPrice();
		// for (PizzaTopping t : this.toppingList) {
			// totalPrice += t.getPrice();
		// }
		// return totalPrice;
	// }

	/**
	 * Compute pizza price as the sum of its parts.
	 */
	@Override
	public Double getPrice() {
		Double totalPrice = 0.0;
		for (MenuItem m : this.selectionList) {
			totalPrice += m.getPrice();
		}
		return totalPrice;
	}

	/**
	 * Sort pizza components according to price.
	 */
	public void sortItems() {
		Collections.sort(this.selectionList);
	}
}
