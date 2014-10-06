public class Side extends Item{ // comments extend item
	private String _size;
	private Size _sizeEnum;

	public Side() {}
	public Side(String name, float price, String size) {
		super(name, price);
		this._size = size;
		this._sizeEnum = Size.getSizeFromId(size);
	}
	public Side(String name, Size size) {
		super(name, 0f);
		this._sizeEnum = size;
		this._size = size.toString();
		switch(size) {
			case Medium:
				super.setPrice(1.99f);
				break;
			case Large:
				super.setPrice(2.49f);
				break;
			case Small:
			default:
				super.setPrice(1.49f);
				break;
		}
	}

	public String getSize() {
		return this._size;
	}
	public void setSize(String size) {
		this._size = size;
		this._sizeEnum = Size.getSizeFromId(size);
		this.setPrice(this._sizeEnum.getPrice());
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