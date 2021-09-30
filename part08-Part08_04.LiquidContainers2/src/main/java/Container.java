public class Container {

	private static final int MAX = 100;
	private int liquid;

	public Container() {
		liquid = 0;
	}

	public int contains() {
		return liquid;
	}
	public void add(int amount) {
		if (amount >= 0) {
			liquid += amount;
			liquid = Math.min(liquid, MAX);
		}
	}

	public void remove(int amount) {
		int removed = 0;
		if (amount >= 0) {
			removed = Math.min(amount, liquid);
			liquid -= removed;
		}
	}

	public String toString() {
		return liquid + "/" + MAX;
	}
}