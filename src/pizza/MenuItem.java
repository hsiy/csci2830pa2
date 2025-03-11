package pizza;

/**
 * MenuItem represents any object that can go on a menu, i.e., it has a descriptive name and a price.
 */
public interface MenuItem extends Comparable<MenuItem> {
	public Double getPrice(); 
	public String toNiceString();

	/**
	 * implements compareTo() for all MenuItems
	 * @param m the item being compared against us
	 * @returns 1 if this > m, 0 if this == m, -1 if this < m
	 */
	public default int compareTo(MenuItem otherItem) {
		return (this.getPrice() > otherItem.getPrice()) ? 
		1 : 
		( (this.getPrice() < otherItem.getPrice()) ? 
			-1 : 
			0);
	}
}
