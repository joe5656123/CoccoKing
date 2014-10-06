public abstract class Entree extends Item {
	public Entree() {} // default constructor
	public Entree(String name, float price) {
		super(name, price); // gets the name and price from Item
	}

	public abstract float getPriceWithAddons(); // gets the price of toppings or condiments
	public abstract String getDescription(); // gets the description of the entree with or without toppings or condiments.
}