public class Combo {
	// A Combo object has an Entree, Side, and a Drink
	private Entree _entree;
	private Side _side;
	private Drink _drink;

	public Combo(Entree entree, Side side, Drink drink) {
		this._entree = entree;
		this._side = side;
		this._drink = drink;
	}

	public Entree getEntree() {
		return this._entree;
	}
	public void setEntree(Entree entree) {
		this._entree = entree;
	}

	public Side getSide() {
		return this._side;
	}
	public void setSide(Side side) {
		this._side = side;
	}

	public Drink getDrink() {
		return this._drink;
	}
	public void setDrink(Drink drink) {
		this._drink = drink;
	}

	public float getPrice() {
		// Takes some money off because combos should be cheaper
		return this._entree.getPriceWithAddons() + this._side.getPrice() + this._drink.getPrice() - 1f;
	}
}