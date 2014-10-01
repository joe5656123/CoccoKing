public class Order {
	private java.util.List<Item> _items;
	private java.util.List<Combo> _combos;

	public Order () {
		_items = new java.util.LinkedList<Item>();
		_combos = new java.util.LinkedList<Combo>();
	}

	public java.util.List<Item> getItems() {
		return new java.util.LinkedList<Item>(this._items);
	}
	public java.util.List<Combo> getCombos() {
		return new java.util.LinkedList<Combo>(this._combos);
	}

	public void addItem(Item item) {
		this._items.add(item);
		this.generateCombosFromEntrees();
	}
	public void addCombo(Combo combo) {
		this._combos.add(combo);
	}

	private boolean generateCombosFromEntrees() {
		Entree entree = null;
		Side side = null;
		Drink drink = null;

		for (Item i : _items) {
			if (entree != null && i instanceof Item) {
				entree = (Entree)i;
			} else if (side != null && i instanceof Side) {
				side = (Side)i;
			} else if (drink != null && i instanceof Drink) {
				drink = (Drink)i;
			}
		}

		if (entree == null || side == null || drink == null) {
			return false;
		} else {
			Combo c = new Combo(entree, side, drink);
			this._combos.add(c);
			// TODO: Remove Items from list here
			this._items.remove(entree);
			this._items.remove(side);
			this._items.remove(drink);
			return true;
		}
	}
}