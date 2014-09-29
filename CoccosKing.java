import java.util.*;
import java.io.*;

public class CoccosKing{
	public static void main(String args[]){
		//Item burger = new Item;
		//Item hoagie = new Item;
		//Item pizza = new Item;
		//Item drink = new Item;

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
			case "b": Burger burger = new Burger("Veggie Burger", 5.00);
			break;
			case "H":
			case "h": Hoagie hoagie = new Hoagie("Italian Hoagie", 7.00);
			break;
			case "P":
			case "p": Pizza pizza = new Pizza("Plain Pizza", 10.00)
			break;
			case "D":
			case "d": Drink drink = new Drink("Water", 2.00)
			break;
		}
	}

	public static void pay(){
		double total = 0;

		System.out.println("Your total is $" + total + "\n Thank you.);
	}
}