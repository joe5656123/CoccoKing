public class Drink {
	private String _name;
	private float _price;
	private int _size;

	public Drink() {}
	public Drink(String name, float price, int size) {
		this._name = name;
		this._price = price;
		this._size = size;
	}

	public String getName() {
		return this._name;
	}
	public void setName(String name) {
		this._name = name;
	}

	public float getPrice() {
		return this._price;
	}
	public void setPrice(float price) {
		this._price = price;
	}

	public int getSize() {
		return this._size;
	}
	public void setSize(int size) {
		this._size = size;
	}
}