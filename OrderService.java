public class OrderService {
	public static float getTotal(Order order) {
		float total = 0;
		for (Item i : order.getEntrees()) {
			total += i.getPrice();
		}
		for (Combo c : order.getCombos()) {
			total += c.getPrice();
		}
		return total;
	}
}