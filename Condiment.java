public enum Condiment {
	Mayo("Mayo"),
	Lettuce("Lettuce"),
	Tomato("Tomato"),
	Pickle("Pickle"),
	Ketchup("Ketchup"),
	Onion("Onion"),
	Cheese("Cheese"),
	Bacon("Bacon");

	private final String _id;
	private Condiment(String id) {
		this._id = id;
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
}