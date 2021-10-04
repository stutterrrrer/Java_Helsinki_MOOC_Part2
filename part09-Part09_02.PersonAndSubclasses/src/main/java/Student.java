public class Student extends Person {
	private int credits;

	public Student(String name, String address) {
		super(name, address);
	}

	public void study() {
		credits++;
	}

	public int credits() {
		return credits;
	}

	public String toString() {
		return super.toString() + "\n"
				+ "  " + "Study credits " + credits;
	}
}
