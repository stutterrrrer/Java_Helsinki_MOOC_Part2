import java.util.ArrayList;

public class Box implements Packable {
	private final double capacity;
	// private double currentWeight = 0;
	// requested by Mooc to favor the method weight() over instance variable current weight;
	private ArrayList<Packable> packables;

	public Box(double capacity) {
		this.capacity = capacity;
		packables = new ArrayList<>();
	}

	public void add(Packable packable) {
		if (weight() + packable.weight() <= capacity) {
			packables.add(packable);
			// currentWeight += packable.weight();
		}
	}

	public String toString() {
		return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
	}

	public double weight() {
		double weight = 0;
		for (Packable packable : packables) {
			weight += packable.weight();
		}
		return weight;
	}
}