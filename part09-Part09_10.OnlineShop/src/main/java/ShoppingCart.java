import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	// arraylist may be more appropriate here, since partial-match searching would be easier.
	// but just for practice with the Map interface:
	private Map<String, Item> cart;

	public ShoppingCart() {
		cart = new HashMap<>();
	}

	public void add(String product, int price) {
		if (!cart.containsKey(product)) {
			cart.put(product, new Item(product, 1, price));
		} else {
			cart.get(product).increaseQuantity();
		}
	}

	public int price() {
		// return total price of the shopping cart:
		int sum = 0;
		for (Item item : cart.values()) {
			sum += item.price();
		}
		return sum;
	}

	public void print() {
		for (Item item : cart.values()) {
			System.out.println(item);
		}
	}
}
