import java.util.*;
import java.io.*;

public class CoccosKing{

	private static Order _order; // cccumulates the price

	public static void main(String args[]){
		_order = new Order(); // new order

		Scanner s = new Scanner(System.in);
		int userInput = 0;
		boolean exit = false; // if true, exits the program

		System.out.println("\n\n\n			   __________________________"); // very artistic graphics
		System.out.println("			   |Welcome to Cocco's King!|");
		System.out.println("			   --------------------------\n\n\n");

		while(!exit){
			System.out.println("               			  1) Order "); // order food
			System.out.println("               			  2)  Pay "); // pay for ordered food
			System.out.println("               			  3) Leave "); // leave the resturant
			System.out.print("			   What would you like to do? ");
			userInput = s.nextInt();

			switch (userInput){
				case 1: order(); // calls the order class
				break;
				case 2: pay(); // calls the pay class
				break;
				case 3: exit = true; // exits the program
				break;
				default:
					System.out.println("\n");
					System.out.println("		   	Please enter a Number from 1 to 3:\np"); // error checking
				break;
			}
		}

		System.out.println("			   \n\n\nThank you! Have a nice Day!"); // a nice goodbye to the vitims- i mean customers
	}

	public static void order(){
		Scanner s = new Scanner(System.in);
		String customerSelection = new String();

		System.out.println("\nWhat would you like to order? (B)urger, (H)oagie, (P)izza, (D)rink");
		customerSelection = s.next();

		switch (customerSelection){
			case "B":
			case "b": orderBurger();
			break;
			case "H":
			case "h": orderHoagie();
			break;
			case "P":
			case "p": orderPizza();
			break;
			case "D":
			case "d": orderDrink();
			break;
		}
	}

	public static void pay (){
		System.out.println(OrderService.getReciept(_order));
		_order = new Order();
	}

	public static void orderBurger(){
		Burger burger = new Burger();
		Scanner s = new Scanner(System.in);
		String burgerSelection = new String();
		char toppingSelection;

		System.out.println("What type of burger do you want? (W)hopper, (H)amburger, (C)heeseburger, (V)eggieburger, (B)uild Your Own");
		burgerSelection = s.next();

		switch (burgerSelection){
			case "W": case "w":
				burger = PresetItems.getWhopper();
			break;
			case "H": case "h":
				burger = PresetItems.getHamburger();
			break;
			case "C": case "c":
				burger = PresetItems.getCheeseburger();
			break;
			case "V": case "v":
				burger = PresetItems.getVeggieBurger();
			break;
			case "B": case "b":
				burger = new Burger("Custom Burger", 3.99f);

				System.out.println("What condements do you want? (done to move on)\n" + Condiment.getAllCondiments());

				do{
					toppingSelection = s.next().charAt(0);
					s.nextLine();

					if (toppingSelection == 'd' || toppingSelection == 'D'){
						break;
					}
					else if (OrderService.getCondimentFromChar(toppingSelection) != null){
						burger.addCondiment(OrderService.getCondimentFromChar(toppingSelection));
					}
					else{
						System.out.println("I'm sorry, we do not have that.");
					}
				}
				while (true);
			break;
		}

		_order.addItem(burger);

		System.out.println(burger.getSummary());
	}

	public static void orderHoagie(){
		Hoagie hoagie = new Hoagie();
		Scanner s = new Scanner(System.in);
		String hoagieSelection = new String();

		System.out.println("What type of hoagie do you want? (R)egular, (I)talian, (T)urkey, (C)hicken Salad, (M)eatball, (P)rovolone,");
		hoagieSelection = s.next();

		switch (hoagieSelection){
			case "R": case "r":
				hoagie = PresetItems.getRegular();
			break;
			case "I": case "i":
				hoagie = PresetItems.getItalian();
			break;
			case "T": case "t":
				hoagie = PresetItems.getTurkey();
			break;
			case "C": case "c":
				hoagie = PresetItems.getChickenSalad();
			break;
			case "M": case "m":
				hoagie = PresetItems.getMeatBall();
			break;
			case "P": case "p":
				hoagie = PresetItems.getProvolone();
			break;
		}

		_order.addItem(hoagie);

		System.out.println(hoagie.getDescription());
	}

	public static void orderPizza(){
		Pizza pizza = null;
		Scanner s = new Scanner(System.in);
		String pizzaSelection = new String();
		char toppingSelection;

		System.out.println("What type of pizza do you want? (M)eatlover, (V)eggielover, (W)hite, (D)elux, (P)lain, (B)uild Your Own");
		pizzaSelection = s.next();

		switch (pizzaSelection){
			case "M": case "m":
				pizza = PresetItems.getMeatLover();
			break;
			case "V": case "v":
				pizza = PresetItems.getVeggieLover();
			break;
			case "W": case "w":
				pizza = PresetItems.getWhite();
			break;
			case "D": case "d":
				pizza = PresetItems.getDeluxe();
			break;
			case "P": case "p":
				pizza = PresetItems.getPlain();
			break;
			case "B": case "b":
				pizza = new Pizza("Custom Pizza", 10.99f);

				System.out.println("What toppings do you want? (done to move on)\n" + Toppings.getAllToppings());

				do{
					toppingSelection = s.next().charAt(0);
					s.nextLine();

					if (toppingSelection == 'd' || toppingSelection == 'D'){
						break;
					}
					else if (OrderService.getToppingsFromChar(toppingSelection) != null){
						pizza.addToppings(OrderService.getToppingsFromChar(toppingSelection));
					}
					else{
						System.out.println("I'm sorry, we do not have that.");
					}
				}
				while (true);
			break;
		}

		_order.addItem(pizza);

		System.out.println(pizza.getSummary());
	}

	public static void orderSide(){
		Side side = new Side();
		Scanner s = new Scanner(System.in);
		String sideSelection = new String();

		System.out.println("What sides would you like?");
		side.setName(s.nextLine());

		System.out.println("What size would you like? (Small, Medium, or Large)");
		side.setSize(s.next().charAt(0));

		_order.addItem(side);
	}

	public static void orderDrink(){
		Drink drink = new Drink();
		Scanner s = new Scanner(System.in);
		String drinkSelection = new String();

		System.out.println("What drink would you like?");
		drink.setName(s.nextLine());

		System.out.println("What size would you like? (Small, Medium, or Large)");
		drink.setSize(s.next().charAt(0));

		_order.addItem(drink);
	}
}