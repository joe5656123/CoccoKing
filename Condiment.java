public enum Condiment { // comments extend toppings
	Mayo("Mayo", 0),
	Lettuce("Lettuce", .15f),
	Tomato("Tomato", .15f),
	Pickle("Pickle", 0),
	Ketchup("Ketchup", 0),
	Onion("Onion", 0),
	Cheese("Cheese", .5f),
	Bacon("Bacon", .8f);

	private final String _id;
	private final float _price;
	private Condiment(String id, float price) {
		this._id = id;
		this._price = price;
	}
	public static Condiment getCondimentFromId(String id) {
		Condiment[] condiments  = Condiment.values();
		for (Condiment currentCondiment : condiments) {
			if (currentCondiment.toString() == id) {
				return currentCondiment;
			}
		}
		return null;
	}
	public static String getAllCondiments() {
		Condiment[] c = Condiment.values();
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