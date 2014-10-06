public enum HoagieType { // hoagie types
	Regular("Regular Hoagie"),
	Italian("Italian Hoagie"),
	OldFashionedItalian("Old Fashioned Italian Hoagie"),
	Turkey("Turkey Hoagie"),
	RoastBeef("Roast Beef Hoagie"),
	ChickenSalad("Chicken Salad Hoagie"),
	TunaSalad("Tuna Salad Hoagie"),
	Cheese("Cheese Hoagie"),
	MeatBall("Meat Ball Hoagie"),
	Provolone("Provolone Hoagie");

	private final String _id;
	private HoagieType(String id) {
		this._id = id;
	}
	public static HoagieType getHoagieTypeFromId(String id) { // gets all the hoagie types
		HoagieType[] condiments  = HoagieType.values();
		for (HoagieType currentHoagieType : condiments) {
			if (currentHoagieType.toString() == id) {
				return currentHoagieType;
			}
		}
		return null;
	}
	public static String getAllHoagieTypes() { // displays all the hoagie topings
		HoagieType[] c = HoagieType.values();
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