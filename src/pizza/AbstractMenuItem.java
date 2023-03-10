package pizza;

public abstract class AbstractMenuItem implements MenuItem, Comparable<MenuItem> {
    public abstract Double getPrice();

    public int compareTo(MenuItem m) {
        return (this.getPrice() > m.getPrice()) ?  1 : (this.getPrice() < m.getPrice()) ? -1 : 0;
    }
}
