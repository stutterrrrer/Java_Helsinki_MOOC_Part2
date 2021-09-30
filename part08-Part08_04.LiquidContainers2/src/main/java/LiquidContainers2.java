
import java.util.Scanner;

public class LiquidContainers2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Container first = new Container(), second = new Container();
		System.out.println("First: " + first + "\n"
				+ "Second: " + second);

		while (true) {
			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			}

			String[] splits = input.split(" ");
			String command = splits[0];
			int amount = Integer.valueOf(splits[1]);
			switch (command) {
				case "add":
					first.add(amount);
					break;
				case "move":
					int beforeMove = first.contains();
					first.remove(amount);
					second.add(beforeMove - first.contains());
					break;
				case "remove":
					second.remove(amount);
					break;
				default:
					System.out.println("unknown command");
			}
			System.out.println("First: " + first + "\n"
					+ "Second: " + second);
		}
	}

}