public class Burger extends Entree {
	private java.util.List<Condiment> _condiments;

	public Burger() { }
	public Burger(String name, float price) {
		super(name, price);
		this._condiments = new java.util.LinkedList<Condiment>();
	}
	public Burger(Burger b) {
		super(b.getName(), b.getPrice());
		this._condiments = new java.util.LinkedList<Condiment>(b.getCondiments());
	}

	public void addCondiment(Condiment c) {
		if (c == null) return;
		_condiments.add(c);
	}
	public boolean addCondiment(String id) {
		Condiment c = Condiment.getCondimentFromId(id);
		if (c == null)
			return false;
		else {
			_condiments.add(c);
			return true;
		}
	}
	public java.util.List<Condiment> getCondiments() {
		return new java.util.LinkedList<Condiment>(this._condiments);
	}
	public String getCondimentsString() {
		String s = "";
		for (Condiment c : _condiments) {
			if (c == _condiments.get(_condiments.size() - 1)) {
				s += c.toString();
				break;
			}
			s += c.toString() + ", ";
		}
		return s;
	}

	public String getDescription() {
		// TODO: BURGER
		//       * Mayo
		//       * Lettuce
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName() + "\n");
		for (Condiment c : _condiments) {
			sb.append("* " + c.toString() + "\n");
		}
		return sb.toString();
	}

	public String getSummary() {
		Condiment[] c = this._condiments.toArray(new Condiment[this._condiments.size()]);
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

	public float getPriceWithAddons() {
		float output = (this.getPrice() == 0) ? 2.99f : this.getPrice();
		for (Condiment c : this._condiments) {
			output += c.getPrice();
		}
		return output;
	}
}
