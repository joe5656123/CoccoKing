public class Pizza extends Entree {
	private java.util.List<Toppings> _toppings;

	public Pizza (String name, float price) {
		super(name, price);
		this._toppings = new java.util.LinkedList<Toppings>();
	}
	public void addToppings(Toppings t) {
		_toppings.add(t);
	}
	public boolean addToppings(String id) {
		Toppings t = Toppings.getToppingsFromId(id);
		if (t == null)
			return false;
		else {
			_toppings.add(t);
			return true;
		}
	}
	public String getToppings() {
		String s = "";
		for (Toppings t : _toppings) {
			if (t == _toppings.get(_toppings.size() - 1)) {
				s += t.toString();
				break;
			}
			s += t.toString() + ", ";
		}
		return s;
	}

	public float getPriceWithAddons() {
		float output = (this.getPrice() == 0) ? 2.99f : this.getPrice();
		for (Toppings t : this._toppings) {
			output += t.getPrice();
		}
		return output;
	}

}
