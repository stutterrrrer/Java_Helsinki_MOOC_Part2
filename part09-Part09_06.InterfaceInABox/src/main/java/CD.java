public class CD implements Packable {
	private String author;
	private String name;
	private int publicationYear;
	private static final double weight = 0.1;

	public CD(String author, String name, int publicationYear) {
		this.author = author;
		this.name = name;
		this.publicationYear = publicationYear;
	}

	public double weight() {
		return weight;
	}

	public String toString() {
		return author + ": " + name + " (" + publicationYear + ")";
	}
}