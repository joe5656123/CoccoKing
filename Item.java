public class Item {
	private String _name;
	private float _price;

	public Item() { }
	public Item(String name, float price) {
		this._name = name;
		this._price = price;
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
}