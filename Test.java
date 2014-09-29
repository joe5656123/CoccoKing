public class Test {
	public static void main (String[] args) {
		Burger burger = new Burger("BURGER", 3.99f);
		System.out.println("Name: " + burger.getName());
		System.out.println("Price: " + burger.getPrice());
		burger.addCondiment(Condiment.Mayo);
		burger.addCondiment("Lettuce");
				/*
		burger.addCondiment(Condiment.Tomato);
		burger.addCondiment(Condiment.Pickle);
		burger.addCondiment(Condiment.Ketchup);
		burger.addCondiment(Condiment.Onion);
		//System.out.println("Condiments: " + burger.getCondiments());
		*/
		System.out.println(burger.getSummery());
	}
}