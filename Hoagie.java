//enum Toppings{pepperoni, mushroom, sausage, tomato, onion, pickle, peppers, spinach, broccoli, oregano, garlic, saltAndPepper, mayo, oil}
//enum HoagieType{regular, italian, oldFashionedItalian, turkey, roastBeef, chickenSalad, tunaSalad, cheese, meatBall}

public class Hoagie extends Item {
	private java.util.List<Toppings> _toppings;

	public Hoagie (String name, float price) {
		super(name, price);
		this._toopings = new java.util.LinkedList<Toppings>();
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
}