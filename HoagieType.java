public enum HoagieType {
	regular("Regular Hoagie"),
	italian("Italian Hoagie"),
	oldFashionedItalian("Old Fashioned Italian Hoagie"),
	turkey("Turkey Hoagie"),
	roastBeef("Roast Beef Hoagie"),
	chickenSalad("Chicken Salad Hoagie"),
	tunaSalad("Tuna Salad Hoagie"),
	cheese("Cheese Hoagie"),
	meatBall("Meat Ball Hoagie");

	private final String _id;
	private HoagieType(String id) {
		this._id = id;
	}
	public static HoagieType getHoagieTypeFromId(String id) {
		HoagieType[] condiments  = HoagieType.values();
		for (HoagieType currentHoagieType : condiments) {
			if (currentHoagieType.toString() == id) {
				return currentHoagieType;
			}
		}
		return null;
	}
	public String toString() {
		return this._id;
	}
}