import java.util.*;
import java.io.*;

public class CoccosKing{

	private static Order _order;

	public static void main(String args[]){
		_order = new Order();

		Scanner s = new Scanner(System.in);
		int userInput = 0;
		boolean exit = false;

		System.out.println("\n\n\n			   __________________________");
		System.out.println("			   |Welcome to Cocco's King!|");
		System.out.println("			   --------------------------\n\n\n");

		while(!exit){
			System.out.println("               			  1) Order ");
			System.out.println("               			  2)  Pay ");
			System.out.println("               			  3) Leave ");
			System.out.print("			   What would you like to do? ");
			userInput = s.nextInt();

			switch (userInput){
				case 1: order();
				break;
				case 2: pay();
				break;
				case 3: exit = true;
				break;
				default:
					System.out.println("\n");
					System.out.println("		   	Please enter a Number from 1 to 3:\np");
				break;
			}
		}

		System.out.println("			   \n\n\nThank you! Have a nice Day!");
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
				burger = PresetItem.getWhopper();
			break;
			case "H": case "h":
				burger = PresetItem.getHamburger();
			break;
			case "C": case "c":
				burger = PresetItem.getCheeseburger();
			break;
			case "V": case "v":
				burger = PresetItem.getVeggieBurger();
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
		String hoagieSelection = new String();

		System.out.println("What type of hoagie do you want? (R)egular, (I)talian, (T)urkey, (C)hicken Salad, (M)eatball, (P)rovolone,");
		hoagieSelection = s.next();

		switch (hoagieSelection){
			case "R": case "r":
				hoagie = PresetItem.getRegular();
			break;
			case "I": case "i":
				hoagie = PresetItem.getItalian();
			break;
			case "T": case "t":
				hoagie = PresetItem.getTurkey();
			break;
			case "C": case "c":
				hoagie = PresetItem.getChickenSalad();
			break;
			case "M": case "m":
				hoagie = PresetItem.getMeatball();
			break;
			case "P": case "p":
				hoagie = PresetItem.getProvole();
			break;
		}

		_order.addItem(hoagie);

		System.out.println(hoagie.getSummary());
	}

	public static void orderPizza(){
		Pizza pizza = new Pizza();
		Scanner s = new Scanner(System.in);
		String pizzaSelection = new String();
		char toppingSelection;

		System.out.println("What type of pizza do you want? (M)eatlover, (V)eggielover, (W)hite, (D)elux, (P)lain, (B)uild Your Own");
		pizzaSelection = s.next();

		switch (pizzaSelection){
			case "M": case "m":
				pizza = PresetItem.getMeatLover();
			return;
			case "V": case "v":
				pizza = PresetItem.getVeggielover();
			return;
			case "W": case "w":
				pizza = PresetItem.getWhite();
			return;
			case "D": case "d":
				pizza = PresetItem.getDelux();
			return;
			case "P": case "p":
				pizza = PresetItem.getPlain();
			return;
			case "B": case "b":
				pizza = new Burger("Custom Pizza", 10.99f);

				System.out.println("What toppings do you want? (done to move on)\n" + Condiment.getAllCondiments());

				do{
					toppingSelection = s.next().charAt(0);
					s.nextLine();

					if (toppingSelection == 'd' || toppingSelection == 'D'){
						break;
					}
					else if (OrderService.getToppingFromChar(toppingSelection) != null){
						pizza.addCondiment(OrderService.getToppingFromChar(toppingSelection));
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