public enum Size {
	Small("Small"),
	Medium("Medium"),
	Large("Large"),
	Other("Other");

	private final String _id;
	private Size(String id) {
		this._id = id;
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