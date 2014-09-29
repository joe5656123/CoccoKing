public enum Condiment {
	Mayo("Mayo"),
	Lettuce("Lettuce"),
	Tomatoe("Tomatoe"),
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
		Condiment[] condiments = Condiment.values();
		String output = "";
		for (Condiment c : condiments) {
			output += c.toString() + "\n";
		}
		// TODO: This ^
		return null;
	}
	public String toString() {
		return this._id;
	}
}