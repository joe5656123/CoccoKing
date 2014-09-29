enum Toppings{
	pepperoni("Pepperoni"),
	mushroom("Mushroom"),
	sausage("Sausage"),
	tomato("Tomato"),
	onion("Onion"),
	pickle("Pickle"),
	peppers("Peppers"),
	spinach("Spinach"),
	broccoli("Broccoli"),
	oregano("Oregano"),
	garlic("Garlic"),
	saltAndPepper("Salt and Pepper"),
	mayo("Mayo"),
	oil("Oil");

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
	public String toString() {
		return this._id;
	}
}
