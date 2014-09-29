public class Burger extends Item {
	private java.util.List<Condiment> _condiments;

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

	public String getSummery() {
		// TODO: "A Vegie Burger with cheese and pickles"
		return null;
	}
}
