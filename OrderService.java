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
		sb.append("***********************\n");
		sb.append("      Coccos King\n");
		sb.append("***********************\n");
		sb.append("\n");
		for (Combo c : order.getCombos()) {
			//sb.append("Combo: $" + c.getPrice() + "\n");
			sb.append(String.format("Combo: $%.2f%n", c.getPrice()));
			sb.append("* " + c.getEntree().getName() + "\n");
			sb.append("* " + c.getSide().getName() + "\n");
			sb.append("* " + c.getDrink().getName() + "\n");
		}
		sb.append("\n");
		for (Item i : order.getItems()) {
			//sb.append(i.getName() + " $" + i.getPrice() + "\n");
			sb.append(String.format("%s $%.2f%n", i.getName(), i.getPrice()));
		}
		sb.append("\n");
		sb.append("***********************\n");
		//sb.append("Sub Total: $" + getSubTotal(order) + "\n");
		sb.append(String.format("Sub Total: $%.2f%n", getSubTotal(order)));
		sb.append("+ 6% PA State Tax:\n");
		//sb.append("Total: $" + getTotal(order));
		sb.append(String.format("Total: $%.2f%n", getTotal(order)));
		return sb.toString();
	}
}