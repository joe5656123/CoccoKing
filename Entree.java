public abstract class Entree extends Item {
	public Entree() {}
	public Entree(String name, float price) {
		super(name, price);
	}

	public abstract float getPriceWithAddons();
	public abstract String getDescription();
}