public class PresetItems {
	// We can do these later
	public static Burger getWhopper() {
		Burger whopper = new Burger("Whopper", 3.99f);
		for (Condiment c : Condiment.values()) {
			whopper.addCondiment(c);
		}
		return whopper;
	}
	public static Hoagie getRegularHoagie() {
		Hoagie reg = new Hoagie("Regular Hoagie", 3.99f);
		// Add some toppings?
		return reg;
	}
}