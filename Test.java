public class Test {
	public static void main (String[] args) {
		System.out.println(Condiment.getAllCondiments());
		System.out.println(HoagieType.getAllHoagieTypes());
		System.out.println(Toppings.getAllToppings());
		Burger burger = new Burger("BURGER", 3.99f);
		//System.out.println("Name: " + burger.getName());
		//System.out.println("Price: " + burger.getPrice());
		burger.addCondiment(Condiment.Mayo);
		burger.addCondiment("Lettuce");
				/*
		burger.addCondiment(Condiment.Tomato);
		burger.addCondiment(Condiment.Pickle);
		burger.addCondiment(Condiment.Ketchup);
		burger.addCondiment(Condiment.Onion);
		//System.out.println("Condiments: " + burger.getCondiments());
		*/
		//System.out.println(burger.getSummary());
		Side side = new Side("Fries", .99f, "Small");
		Drink drink = new Drink("Coke", .99f, 16);
		Order order = new Order();
		order.addItem(burger);
		order.addItem(side);
		order.addItem(drink);
		//order.addCombo(new Combo(burger, side, drink));
		order.addItem(new Drink("Coke", 1.99f, 32));
		System.out.println(OrderService.getReciept(order));
	}
}
