package FlightControl;


import FlightControl.logic.ControlCenter;
import FlightControl.ui.TextUI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write the main program here. It is useful to create some classes of your own.
		Scanner scanner = new Scanner(System.in);
		ControlCenter control = new ControlCenter();

		TextUI ui = new TextUI(scanner, control);
		ui.start();
	}
}
