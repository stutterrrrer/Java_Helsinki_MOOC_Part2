public class Person {
	private Education education;
	private String name;

	public Person(String name, Education education) {
		this.education = education;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ", " + education;
	}

	public Education getEducation() {
		return education;
	}
}
