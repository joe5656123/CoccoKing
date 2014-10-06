public class OrderService {
	public static float getTotal(Order order) {
		return getSubTotal(order) * (1.06f);
	}

	public static float getSubTotal(Order order) {
		float total = 0;
		for (Item i : order.getItems()) {
			total += i.getPrice();
		}
		for (Combo c : order.getCombos()) {
			total += c.getPrice();
		}
		return total;
	}

	public static String getReciept(Order order) {
		StringBuilder sb = new StringBuilder();
		// TODO add setw
		// TODO add boarder around reciept
		// This should be the last thing we worry about
		sb.append("=======================\n\n");
		sb.append("      Coccos King\n\n");
		sb.append("=======================\n");
		sb.append("\n");
		for (Combo c : order.getCombos()) {
			sb.append(String.format("Combo: $%.2f%n", c.getPrice()));
			sb.append("* " + c.getEntree().getName() + "\n");
			sb.append("* " + c.getSide().getName() + "\n");
			sb.append("* " + c.getDrink().getName() + "\n");
		}
		sb.append("\n");
		for (Item i : order.getItems()) {
			sb.append(String.format("%s $%.2f%n", i.getName(), i.getPrice()));
		}
		sb.append("\n");
		sb.append("=======================\n");
		sb.append(String.format("Sub Total: $%.2f%n", getSubTotal(order)));
		sb.append("+ 6% PA State Tax:\n");
		sb.append(String.format("Total: $%.2f%n", getTotal(order)));
		return sb.toString();
	}

	public static Condiment getCondimentFromChar(char c) {
		switch (c) {
			case 'M': case 'm':
				return Condiment.Mayo;
			case 'L': case 'l':
				return Condiment.Lettuce;
			case 'T': case 't':
				return Condiment.Tomato;
			case 'P': case 'p':
				return Condiment.Pickle;
			case 'K': case 'k':
				return Condiment.Ketchup;
			case 'O': case 'o':
				return Condiment.Onion;
			case 'C': case 'c':
				return Condiment.Cheese;
			case 'B': case 'b':
				return Condiment.Bacon;
			default:
				return null;
		}
	}

	public static Toppings getToppingsFromChar(char t) {
		switch (t) {
			case 'P': case 'p':
				return Toppings.Pepperoni;
			case 'M': case 'm':
				return Toppings.Mushroom;
			case 'S': case 's':
				return Toppings.Sausage;
			case 'T': case 't':
				return Toppings.Tomato;
			case 'O': case 'o':
				return Toppings.Onion;
			case 'G': case 'g':
				return Toppings.GreenPeppers;
			case 'B': case 'b':
				return Toppings.Broccoli;
			default:
				return null;
		}
	}
	public static Size getSizeFromChar(char s) {
		switch (s) {
			case 'S': case 's':
				return Size.Small;
			case 'M': case 'm':
				return Size.Medium;
			case 'L': case 'l':
				return Size.Large;
			default:
				return null;
		}
	}
}
