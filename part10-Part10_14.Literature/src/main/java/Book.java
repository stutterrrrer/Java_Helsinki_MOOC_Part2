public class Book {
	private String name;
	private int recommendedAge;

	public Book(String name, int recommendedAge) {
		this.name = name;
		this.recommendedAge = recommendedAge;
	}

	public String getName() {
		return name;
	}

	public int getRecommendedAge() {
		return recommendedAge;
	}

	public String toString() {
		return name + " (recommended for " + recommendedAge + " year-olds or older)";
	}
}
