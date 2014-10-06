public class Hoagie extends Entree { // comments extends entree
	private HoagieType _hoagieType;

	public Hoagie () {
		this._hoagieType = HoagieType.Regular;
	}
	public Hoagie (String name, float price) {
		super(name, price);
		this._hoagieType = HoagieType.Regular;
	}
	public Hoagie (String name, float price, HoagieType ht) {
		super(name, price);
		this._hoagieType = ht;
	}

	public void setHoagieType(HoagieType ht) {
		this._hoagieType = ht;
	}
	public boolean setHoagieType(String ht) {
		HoagieType t = HoagieType.getHoagieTypeFromId(ht);
		if (t == null) {
			return false;
		} else {
			this.setHoagieType(t);
			return true;
		}
	}

	public float getPriceWithAddons() {
		return this.getPrice() == 0 ? 4.99f : this.getPrice();
	}
	public String getDescription() {
		return this._hoagieType.toString();
	}
}