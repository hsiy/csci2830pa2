package pizza.sauce;
import pizza.AbstractMenuItem;

public abstract class PizzaSauce extends AbstractMenuItem {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Sauce is: " + toString();
	}

	public Double getPrice() {
		return 0.30; // default price for sauce
	}
}
