public class Test {
	public static void main (String[] args) {
		Burger burger = new Burger("BURGER", 3.99f);
		System.out.println("Name: " + burger.getName());
		System.out.println("Price: " + burger.getPrice());
		burger.addCondiment(Condiment.Mayo);
		burger.addCondiment("Lettuce");
		System.out.println("Condiments: " + burger.getCondiments());
	}
}