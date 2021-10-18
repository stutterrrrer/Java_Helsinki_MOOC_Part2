
import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Book> books = new ArrayList<>();
		while (true) {
			System.out.println("Input the name of the book, empty stops: ");
			String name = scanner.nextLine();
			if (name.equals("")) {
				break;
			}
			System.out.println("Input the age recommendation: ");
			int recommendedAge = Integer.parseInt(scanner.nextLine());
			books.add(new Book(name, recommendedAge));
		}

		// sort the books before printing.
		Comparator<Book> bookComparator = Comparator
				.comparing(Book::getRecommendedAge)
				.thenComparing(Book::getName);

		Collections.sort(books, bookComparator);

		System.out.println(books.size() + " books in total.\n" +
				"Books:");

		for (Book book : books) {
			System.out.println(book);
		}
	}
}
