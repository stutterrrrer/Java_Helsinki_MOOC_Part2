public class Item {
	private final String product;
	private int quantity;
	private final int unitPrice;

	public Item(String product, int quantity, int unitPrice) {
		this.product = product;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int price() {
		return unitPrice * quantity;
	}

	public void increaseQuantity() {
		quantity++;
	}

	public String toString() {
		return product + ": " + quantity;
	}
}
