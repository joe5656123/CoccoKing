public class Side extends Item{
	private String _name;
	private float _price;
	private String _size;

	public Side() {}
	public Side(String name, float price, String size) {
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

	public String getSize() {
		return this._size;
	}
	public void setSize(String size) {
		this._size = size;
	}
}