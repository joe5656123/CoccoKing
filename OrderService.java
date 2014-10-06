public class OrderService { // A helper class for all things order related
	// Gets the total with tax
	public static float getTotal(Order order) {
		return getSubTotal(order) * (1.06f);
	}

	// Gets the total without tax
	public static float getSubTotal(Order order) {
		float total = 0;
		for (Item i : order.getItems()) {
			if (i instanceof Entree) {
				total += ((Entree)i).getPriceWithAddons();
			} else {
				total += i.getPrice();
			}
		}
		for (Combo c : order.getCombos()) {
			total += c.getPrice();
		}
		return total;
	}

	// Returns a string Reciept
	public static String getReciept(Order order) {
		StringBuilder sb = new StringBuilder();
		sb.append("=======================\n\n");
		sb.append("      Coccos King\n\n");
		sb.append("=======================\n");
		sb.append("\n");
		for (Combo c : order.getCombos()) {
			sb.append(String.format("Combo: $%.2f%n", c.getPrice()));
			sb.append("* " + c.getEntree().getDescription() + "\n");
			sb.append("* " + c.getSide().getName() + " $" + c.getSide().getPrice() + "\n");
			sb.append("* " + c.getDrink().getName() + " $" + c.getDrink().getPrice() + "\n");
		}
		sb.append("\n");
		for (Item i : order.getItems()) {
			if (i instanceof Entree) {
				sb.append(((Entree)i).getDescription());
			} else {
				sb.append(String.format("%s $%.2f%n", i.getName(), i.getPrice()));
			}
		}
		sb.append("\n");
		sb.append("=======================\n");
		sb.append(String.format("Sub Total: $%.2f%n", getSubTotal(order)));
		sb.append("+ 6% PA State Tax:\n");
		sb.append(String.format("Total: $%.2f%n", getTotal(order)));
		return sb.toString();
	}

	// Convers a char to a Condiment
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

	// Convers a char to a Topping
	public static Toppings getToppingsFromChar(char t) {
		switch (t) {
			case 'P': case 'p':
				return Toppings.Pepperoni;
			case 'M': case 'm':
				return Toppings.Mushroom;
			case 'S': case 's':
				return Toppings.Sausage;
			case 'H': case 'h':
				return Toppings.Hamburger;
			case 'T': case 't':
				return Toppings.Tomato;
			case 'O': case 'o':
				return Toppings.Onion;
			case 'G': case 'g':
				return Toppings.GreenPeppers;
			case 'B': case 'b':
				return Toppings.Broccoli;
			case 'W': case 'w':
				return Toppings.WhiteSauce;
			case 'R': case 'r':
				return Toppings.RedSauce;
			default:
				return null;
		}
	}

	// Converts a char to a Size
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
