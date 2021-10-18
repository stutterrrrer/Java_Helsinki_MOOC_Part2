public class Student implements Comparable<Student> {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Student compared) {
		// alphabetical, i.e. ascending order: this - compared.
		// use String class's over-ridden compareTo().
		return name.compareTo(compared.name);
	}
}
