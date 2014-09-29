public class Combo {
	private Item _item;
	private Side _side;
	private Drink _drink;

	public Combo(Item item, Side side, Drink drink) {
		this._item = item;
		this._side = side;
		this._drink = drink;
	}

	public Item getItem() {
		return this._item;
	}
	public void setItem(Item item) {
		this._item = item;
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
}