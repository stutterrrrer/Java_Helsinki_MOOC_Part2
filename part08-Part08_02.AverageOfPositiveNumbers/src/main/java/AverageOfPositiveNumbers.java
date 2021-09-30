
import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0, count = 0;
		while (true) {
			int input = Integer.parseInt(scanner.nextLine());
			if (input == 0) {
				break;
			}
			if (input > 0) {
				sum += input;
				count++;
			}
		}
		System.out.println(count == 0 ? "Cannot calculate the average" : (double)sum / count);
	}
}
