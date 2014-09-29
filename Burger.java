public class Burger extends Entree {
	private java.util.List<Condiment> _condiments;

	public Burger() {
	}

	public Burger(String name, float price) {
		super(name, price);
		this._condiments = new java.util.LinkedList<Condiment>();
	}
	public void addCondiment(Condiment c) {
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
	public String getCondiments() {
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

	public String getSummary() {
		// TODO: "A Vegie Burger with cheese and pickles"
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
}
