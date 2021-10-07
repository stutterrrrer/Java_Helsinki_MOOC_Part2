public class OneItemBox extends Box {
	private Item item;

	public OneItemBox() {
		item = null;
	}
	public void add(Item item) {
		if (this.item == null) {
			this.item = item;
		}
	}

	public boolean isInBox(Item item) {
		if (this.item != null) {
			return this.item.equals(item);
		}
		return false;
	}
}
