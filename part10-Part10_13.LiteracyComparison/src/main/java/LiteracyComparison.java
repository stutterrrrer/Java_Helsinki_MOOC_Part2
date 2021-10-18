import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("literacy.csv"))
					.map(LiteracyRecord::new) // LiteracyRecord constructor doing the heavy lifting
					.sorted()
					.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
