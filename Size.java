public enum Size {
	Small("Small", 1.49f),
	Medium("Medium", 1.99f),
	Large("Large", 2.49f),
	Other("Other", 0f);

	private final String _id;
	private final float _price;
	private Size(String id, float price) {
		this._id = id;
		this._price = price;
	}
	public static Size getSizeFromId(String id) {
		Size[] s  = Size.values();
		for (Size cs : s) {
			if (cs.toString() == id) {
				return cs;
			}
		}
		return Size.Other;
	}
	public static String getAllSizes() {
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