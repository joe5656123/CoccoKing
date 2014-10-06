public class Pizza extends Entree { // comments extend entree
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
		float output = (this.getPrice() == 0) ? 14.99f : this.getPrice();
		for (Toppings t : this._toppings) {
			output += t.getPrice();
		}
		return output;
	}

	public String getDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName() + " $" + this.getPriceWithAddons() + "\n");
		for (Toppings c : _toppings) {
			sb.append("    * " + c.toString() + "\n");
		}
		return sb.toString();
	}
	public String getSummary() {
		Toppings[] c = this._toppings.toArray(new Toppings[this._toppings.size()]);
		String summery = "A " + this.getName() + " with: ";
		if (c.length == 2) {
			summery += c[0] + " and " + c[1] + ".";
		} else if (c.length > 1) {
			for (int i = 0, size = c.length; i < size; i++) {
				if (i == size - 1) {
					summery += "and " + c[i].toString() + ".";
				} else {
					summery += c[i].toString() + ", ";
				}
			}
		} else {
			summery += c[0] + ".";
		}
		return summery;
	}
}
