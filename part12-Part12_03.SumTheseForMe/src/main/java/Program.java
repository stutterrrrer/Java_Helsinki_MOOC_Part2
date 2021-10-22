
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// test your method here
		int[] numbers = {3, -1, 8, 4};

		System.out.println(sum(numbers, 0, 0, 0, 0));
		System.out.println(sum(numbers, 0, 0, 0, 10));
		System.out.println(sum(numbers, 0, 1, 0, 10));
		System.out.println(sum(numbers, 0, 1, -10, 10));
		System.out.println(sum(numbers, -1, 999, -10, 10));
	}

	public static int sum(int[] array, int from, int to, int smallest, int largest) {
		int sum = 0;
		from = Math.max(from, 0);
		to = Math.min(to, array.length);
		for (int i = from; i < to; i++) {
			sum += array[i] >= smallest && array[i] <= largest ? array[i] : 0;
		}
		return sum;
	}
}
