
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LimitedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Collection<String> inputs = new ArrayList<>();
		while (true) {
			String input = scanner.nextLine();
			if (input.matches("^-.+")) {
				break;
			}
			inputs.add(input);
		}

		inputs.stream()
				.mapToInt(Integer::valueOf)
				.filter(i -> i >= 1 && i <= 5)
				.forEach(System.out::println);
	}
}
