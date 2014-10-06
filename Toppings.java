enum Toppings{
	Pepperoni("Pepperoni"),
	Mushroom("Mushroom"),
	Sausage("Sausage"),
	Tomato("Tomato"),
	Onion("Onion"),
	Pickle("Pickle"),
	Peppers("Peppers"),
	Spinach("Spinach"),
	Broccoli("Broccoli"),
	Oregano("Oregano"),
	Garlic("Garlic"),
	SaltAndPepper("Salt and Pepper"),
	Mayo("Mayo"),
	Oil("Oil");

	private final String _id;
	private Toppings(String id) {
		this._id = id;
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
}
