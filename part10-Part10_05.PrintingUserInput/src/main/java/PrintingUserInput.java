
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PrintingUserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Collection<String> inputs = new ArrayList<>();

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}
			inputs.add(input);
		}

		inputs.stream()
				.forEach(element -> System.out.println(element));
	}
}
