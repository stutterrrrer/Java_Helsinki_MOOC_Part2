import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
	private ArrayList<Item> items;
	private int currentWeight = 0;
	private final int capacity;

	public BoxWithMaxWeight(int capacity) {
		items = new ArrayList<>();
		this.capacity = capacity;
	}

	public void add(Item item) {
		if (currentWeight + item.getWeight() <= capacity) {
			items.add(item);
			currentWeight += item.getWeight();
		}
	}

	public boolean isInBox(Item item) {
		return items.contains(item);
	}
}
