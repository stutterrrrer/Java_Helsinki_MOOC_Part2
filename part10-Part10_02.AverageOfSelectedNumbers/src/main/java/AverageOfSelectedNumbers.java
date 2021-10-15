
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageOfSelectedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// test your program here.

		System.out.println("Input numbers, type \"end\" to stop.");
		List<String> inputs = new ArrayList<>();
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("end")) {
				break;
			}
			inputs.add(input);
		}

		IntStream numbers = inputs.stream()
				.mapToInt(v -> Integer.valueOf(v));
		System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
		String filter;
		double average;
		if (scanner.nextLine().equals("n")) {
			filter = "negative";
			average = numbers.filter(x -> x < 0).average().getAsDouble();
		} else {
			filter = "positive";
			average = numbers.filter(x -> x > 0).average().getAsDouble();
		}

		System.out.println("Average of the " + filter + " numbers: " + average);
	}
}
