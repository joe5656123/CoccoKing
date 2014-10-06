public class Drink extends Item{
	private int _size;
	private Size _sizeEnum;

	public Drink() {}
	public Drink(String name, float price, int size) {
		super(name, price);
		this._size = size;
	}
	public Drink(String name, Size size) {
		super(name, 0f);
		this._sizeEnum = size;
		switch(size) {
			case Medium:
				this._size = 32;
				super.setPrice(1.99f);
				break;
			case Large:
				this._size = 40;
				super.setPrice(2.49f);
				break;
			default:
			case Small:
				this._size = 20;
				super.setPrice(1.49f);
				break;
		}
	}

	public int getSize() {
		return this._size;
	}
	public void setSize(int size) {
		this._size = size;
	}
	public void setSize(Size s) {
		this._sizeEnum = s;
		this.setPrice(s.getPrice());
	}
	public void setSize(char s) {
		Size size = OrderService.getSizeFromChar(s);
		if (size == null) {
			return;
		}
		this._sizeEnum = size;
		this.setPrice(size.getPrice());
	}
}