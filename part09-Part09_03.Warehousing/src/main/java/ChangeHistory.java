import java.util.ArrayList;

public class ChangeHistory {
	private ArrayList<Double> history;

	public ChangeHistory() {
		history = new ArrayList<>();
	}

	public void add(double status) {
		history.add(status);
	}

	public void clear() {
		history.clear();
	}

	public String toString() {
		return history.toString();
	}

	public double maxValue() {
		if (history.isEmpty()) {
			return 0;
		}
		double max = history.get(0);
		for (int i = 1; i < history.size(); i++) {
			max = Math.max(max, history.get(i));
		}
		return max;
	}

	public double minValue() {
		if (history.isEmpty()) {
			return 0;
		}
		double min = history.get(0);
		for (int i = 1; i < history.size(); i++) {
			min = Math.min(min, history.get(i));
		}
		return min;
	}

	public double average() {
		double sum = 0;
		for (Double inventory : history) {
			sum += inventory;
		}
		return sum / history.size();
	}
}
