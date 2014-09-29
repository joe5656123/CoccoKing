import java.util.*;
import java.io.*;

public class CoccosKing{
	public static void main(String args[]){

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

		System.out.println("What would you like to order? (B)urger, (H)oagie, (P)izza, (D)rink");
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
			//case "D":
			//case "d": orderDrink();
			//break;
		}
	}

	public static void pay (){
		double total = 0;

		System.out.println("Your total is $" + total + "\n Thank you.");
	}

	public static Burger orderBurger(){
		Scanner s = new Scanner(System.in);
		String burgerSelection = new String();
		String toppingSelection = new String();

		System.out.println("What type of burger do you want? (W)hopper, (H)amburger, (V)eggieburger");
		burgerSelection = s.next();

		switch (burgerSelection){
			case "W":
			case "w": Burger burger = new Burger("Whopper", 4.00f);
			break;
			case "H":
			case "h": Burger burger = new Burger("Hamburger", 3.00f);
			break;
			case "V":
			case "v": Burger burger = new Burger("Veggieburger", 3.00f);
			break;
		}

		System.out.println("What condements do you want? (None to move on)");
		toppingSelection = s.nextLine();

		while (toppingSelection != "none" || toppingSelection != "None"){
			if (Condiment.getCondimentFromId(burgerSelection) = null){
				System.out.println("I'm sorry, we do not have " + toppingSelection);
				System.out.println("Would you like another? (None to move on)" + toppingSelection);
				toppingSelection = s.nextLine();
			}
			else
				System.out.println("Would you like another? (None to move on)" + toppingSelection);
				toppingSelection = s.nextLine();

			if (finishSelection == "none" || finishSelection == "None")
		}

		System.out.println(burger.getSummary());
	}
}