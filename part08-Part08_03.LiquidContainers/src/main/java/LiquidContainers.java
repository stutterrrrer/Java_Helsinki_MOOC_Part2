
import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = 0, second = 0;
		final int MAX = 100;

		System.out.println("First: " + first + "/" + MAX + "\n"
				+ "Second: " + second + "/" + MAX);
		while (true) {
			String input = scan.nextLine();
			if (input.equals("quit")) {
				return;
			}
			String[] splits = input.split(" ");
			String command = splits[0];
			int amount = Integer.parseInt(splits[1]);
			switch (command) {
				case "add":
					first = amount > 0 ? Math.min(first + amount, MAX) : first;
					break;
				case "move":
					int moved = amount > 0 ? Math.min(amount, first) : 0;
					first -= moved;
					second = Math.min(second + moved, MAX);
					break;
				case "remove":
					second = amount > 0 ? Math.max(second - amount, 0) : second;
					break;
				default:
					System.out.println("Unknown command");
			}
			System.out.println("First: " + first + "/" + MAX + "\n"
					+ "Second: " + second + "/" + MAX);
		}
	}

}
