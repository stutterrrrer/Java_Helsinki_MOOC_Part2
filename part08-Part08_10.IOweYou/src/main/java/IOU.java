import java.util.HashMap;

public class IOU {
	private HashMap<String, Double> dues;

	public IOU() {
		dues = new HashMap<>();
	}

	public void setSum(String toWhom, double amount) {
		dues.put(toWhom, amount);
	}

	public double howMuchDoIOweTo(String toWhom) {
		return dues.getOrDefault(toWhom, (double) 0);
	}
}
