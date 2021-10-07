public class CustomTacoBox implements TacoBox {
	private int tacos;

	public CustomTacoBox(int number) {
		tacos = number;
	}

	public int tacosRemaining() {
		return tacos;
	}

	public void eat() {
		if (tacos > 0) {
			tacos--;
		}
	}
}