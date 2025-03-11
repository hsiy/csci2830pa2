package pizza.sauce;

/**
 * {@code AlfredoSauce} represents a special kind of heavy cream-based sauce
 */
public class AlfredoSauce extends PizzaSauce {
	@Override
	public String toString() {
		return "Alfredo Sauce";
	}
	
	@Override
	public Double getPrice() {
		return 0.50;
	}
}
