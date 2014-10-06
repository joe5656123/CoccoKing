public class Hoagie extends Entree {
	private java.util.List<Toppings> _toppings;
	private HoagieType _hoagieType;

	public Hoagie (String name, float price) {
		super(name, price);
		this._toppings = new java.util.LinkedList<Toppings>();
		this._hoagieType = HoagieType.Regular;
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
	public void setHoagieType(HoagieType ht) {
		this._hoagieType = ht;
	}
	public boolean setHoagieType(String ht) {
		HoagieType t = HoagieType.getHoagieTypeFromId(ht);
		if (t == null) {
			return false;
		} else {
			this.setHoagieType(t);
			return true;
		}
	}

	public float getPriceWithAddons() {
		float output = (this.getPrice() == 0) ? 2.99f : this.getPrice();
		for (Toppings t : _toppings) {
			output += t.getPrice();
		}
		return output;
	}
}