enum Toppings{
	Pepperoni("Pepperoni", 1f),
	Mushroom("Mushroom", .5f),
	Sausage("Sausage", 1f),
	Hamburger("Hamburger", 1f),
	Tomato("Tomato", .5f),
	Onion("Onion", .5f),
	GreenPeppers("Green Peppers", .5f),
	Spinach("Spinach", .5f),
	Broccoli("Broccoli", .5f),
	Oregano("Oregano", 0),
	Mayo("Mayo", 0),
	Oil("Oil", 0),
	RedSauce("Red Sauce", 0),
	WhiteSauce("White Sauce", 0);

	private final String _id;
	private final float _price;
	private Toppings(String id, float price) {
		this._id = id;
		this._price = price;
	}
	public static Toppings getToppingsFromId(String id) {
		Toppings[] condiments  = Toppings.values();
		for (Toppings currentToppings : condiments) {
			if (currentToppings.toString() == id) {
				return currentToppings;
			}
		}
		return null;
	}
	public static String getAllToppings() {
		Toppings[] c = Toppings.values();
		String output = "";
		if (c.length == 2) {
			output += c[0] + " and " + c[1] + ".";
		} else if (c.length > 1) {
			for (int i = 0, size = c.length; i < size; i++) {
				if (i == size - 1) {
					output += "and " + c[i].toString() + ".";
				} else {
					output += c[i].toString() + ", ";
				}
			}
		} else {
			output += c[0] + ".";
		}
		return output + "\n";
	}
	public String toString() {
		return this._id;
	}
	public float getPrice() {
		return this._price;
	}
}
