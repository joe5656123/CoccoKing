public enum Condiment {
	Mayo("Mayo"),
	Lettuce("Lettuce"),
	Tomatoe("Tomatoe"),
	Pickle("Pickle"),
	Ketchup("Ketchup"),
	Onion("Onion");

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
	public String toString() {
		return this._id;
	}
}