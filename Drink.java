public class Drink extends Item{
	private int _size;

	public Drink() {}
	public Drink(String name, float price, int size) {
		super(name, price);
		this._size = size;
	}

	public int getSize() {
		return this._size;
	}
	public void setSize(int size) {
		this._size = size;
	}
}