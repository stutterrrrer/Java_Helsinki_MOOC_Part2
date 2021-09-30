import java.util.Scanner;

public class UserInterface {
	private TodoList todos;
	private final Scanner scanner;

	public UserInterface(TodoList todos, Scanner scanner) {
		this.todos = todos;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();
			switch (command) {
				case "stop":
					return;
				case "add":
					add();
					break;
				case "list":
					todos.print();
					break;
				case "remove":
					remove();
					break;
				default:
					System.out.println("command not recognized");
			}
		}
	}

	private void remove() {
		System.out.print("Which one is removed? ");
		// the minus 1 to get arrayList index action is done inside TodoList class's remove method already.
		int index = Integer.valueOf(scanner.nextLine());
		todos.remove(index);
	}

	private void add() {
		System.out.print("To add: ");
		todos.add(scanner.nextLine());
	}
}
