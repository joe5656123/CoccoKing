public class Side extends Item{
	private String _size;

	public Side() {}
	public Side(String name, float price, String size) {
		super(name, price);
		this._size = size;
	}

	public String getSize() {
		return this._size;
	}
	public void setSize(String size) {
		this._size = size;
	}
}