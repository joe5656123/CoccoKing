public class PresetItems {
	// Burgers
	public static Burger getWhopper() { // names, prices, and condiments
		Burger whopper = new Burger("Whopper", 3.99f);
		for (Condiment c : Condiment.values()) {
			whopper.addCondiment(c);
		}
		return whopper;
	}
	public static Burger getVeggieBurger() { // names, prices, and condiments
		Burger v = new Burger("Veggie Burger", 3.99f);
		for (Condiment c : Condiment.values()) {
			if (c != Condiment.Bacon) {
				v.addCondiment(c);
			}
		}
		return v;
	}
	public static Burger getHamburger() { // names, prices, and condiments
		Burger burg = new Burger("Hamburger", .99f);
		burg.addCondiment(Condiment.Pickle);
		burg.addCondiment(Condiment.Ketchup);
		return burg;
	}
	public static Burger getCheeseburger() {  // names, prices, and condiments with cheese
		Burger cb = getHamburger();
		cb.addCondiment(Condiment.Cheese);
		return cb;
	}

	// Hoagies are all preset and you may not change them
	public static Hoagie getRegular() {
		return new Hoagie("Regular Hoagie", 3.99f);
	}
	public static Hoagie getItalian() {
		return new Hoagie("Italian Hoagie", 4.99f, HoagieType.Italian);
	}
	public static Hoagie getChickenSalad() {
		return new Hoagie("Chicken Salad Hoagie", 4.99f, HoagieType.ChickenSalad);
	}
	public static Hoagie getTurkey() {
		return new Hoagie("Turkey Hoagie", 4.99f, HoagieType.Turkey);
	}
	public static Hoagie getProvolone() {
		return new Hoagie("Provolone Hoagie", 4.99f, HoagieType.Provolone);
	}
	public static Hoagie getMeatBall() {
			return new Hoagie("Meatball Hoagie", 5.99f, HoagieType.MeatBall);
	}

	// Pizzas are preset and build-your-own like burgers with the same instantiation for price, name, and toppings instead of condiments
	public static Pizza getMeatLover() {
		Pizza tmt = new Pizza("Triple Meat Treat", 14.99f);
		tmt.addToppings(Toppings.RedSauce);
		tmt.addToppings(Toppings.Pepperoni);
		tmt.addToppings(Toppings.Sausage);
		tmt.addToppings(Toppings.Hamburger);
		return tmt;
	}
	public static Pizza getVeggieLover() {
		Pizza vl = new Pizza("Veggie Lover", 14.99f);
		vl.addToppings(Toppings.RedSauce);
		vl.addToppings(Toppings.Mushroom);
		vl.addToppings(Toppings.Tomato);
		vl.addToppings(Toppings.Onion);
		vl.addToppings(Toppings.GreenPeppers);
		vl.addToppings(Toppings.Broccoli);
		return vl;
	}
	public static Pizza getPlain() {
		Pizza p = new Pizza("Plain Pizza", 9.99f);
		p.addToppings(Toppings.RedSauce);
		return p;
	}
	public static Pizza getWhite() {
		Pizza p = new Pizza("White Pizza", 9.99f);
		p.addToppings(Toppings.RedSauce);
		return p;
	}
	public static Pizza getDeluxe() {
		Pizza dlx = new Pizza("Deluxe Pizza", 14.99f);
		for (Toppings t : Toppings.values()) {
			dlx.addToppings(t);
		}
		return dlx;
	}
}