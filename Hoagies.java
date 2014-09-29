import java.util.*;

enum Toppings{pepperoni, mushroom, sausage, tomato, onion, pickle, peppers, spinach, broccoli, oregano, garlic, saltAndPepper, mayo, oil}
enum HoagieType{regular, italian, oldFashionedItalian, turkey, roastBeef, chickenSalad, tunaSalad, cheese, meatBall}

public class Hoagies extends Item{
	private String size;
	private HogieType hoagie;
	private java.util.List<Toppings> toppings;

	public Hoagies(String name, double price, HoagieType hoagie){
			this.hoagie = hoagie;
			super(name, price, hoagie);
	}
}