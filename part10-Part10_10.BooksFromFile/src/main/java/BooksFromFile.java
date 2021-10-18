
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// test your method here

	}

	public static List<Book> readBooks(String file) {
		List<Book> books = new ArrayList<>();
		try {
			Files.lines(Paths.get(file))
					.map(string -> string.split(",")) // a stream of arrays of String.
					.map(array -> new Book(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), array[3]))
					// it's now a stream of Book.
					.forEach(books::add);
		} catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return books;
	}
}
