public class Order {
	private java.util.List<Object> _items;
	private java.util.List<Combo> _combos;

	public Order () {
		_items = new java.util.LinkedList<Object>();
		_combos = new java.util.LinkedList<Combo>();
	}

	public java.util.List<Object> getItems() {
		return _items;
	}
	public java.util.List<Combo> getCombos() {
		return _combos;
	}



	private void generateCombosFromItems() {
		// TODO: this ^
	}
}