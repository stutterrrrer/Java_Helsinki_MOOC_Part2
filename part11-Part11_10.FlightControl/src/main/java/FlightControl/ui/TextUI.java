package FlightControl.ui;

import FlightControl.logic.*;

import java.util.Scanner;

public class TextUI {
	private Scanner scanner;
	private ControlCenter controlCenter;

	public TextUI(Scanner scanner, ControlCenter controlCenter) {
		this.scanner = scanner;
		this.controlCenter = controlCenter;
	}

	public void start() {
		assetControlStart();
		System.out.println();
		flightControlStart();
		System.out.println();
	}

	public void assetControlStart() {
		System.out.println("Airport Asset Control");
		System.out.println("--------------------");
		System.out.println();

		while (true) {
			System.out.print("Choose an action:\n"
					+ "[1] Add an airplane\n"
					+ "[2] Add a flight\n"
					+ "[x] Exit Airport Asset Control\n"
					+ "> ");
			String command = scanner.nextLine();
			switch (command) {
				case "x":
					return;
				case "1":
					addAirplane();
					break;
				case "2":
					addFlight();
			}
		}
	}

	public void flightControlStart() {
		System.out.println("Flight Control");
		System.out.println("------------");
		System.out.println();

		while (true) {
			System.out.println("Choose an action:");
			System.out.println("[1] Print airplanes");
			System.out.println("[2] Print flights");
			System.out.println("[3] Print airplane details");
			System.out.println("[x] Quit");

			System.out.print("> ");
			String command = scanner.nextLine();
			switch (command) {
				case "x":
					return;
				case "1":
					controlCenter.printAirplanes();
					break;
				case "2":
					controlCenter.printFlights();
					break;
				case "3":
					printPlaneDetail();
			}
		}
	}

	private void printPlaneDetail() {
		System.out.print("Give the airplane id: ");
		String planeId = scanner.nextLine();
		controlCenter.printAirplaneDetails(planeId);
	}

	private void addFlight() {
		System.out.print("Give the airplane id: ");
		String planeId = scanner.nextLine();
		System.out.print("Give the departure airport id: ");
		String from = scanner.nextLine();
		System.out.print("Give the target airport id: ");
		String to = scanner.nextLine();
		controlCenter.addFlight(planeId, from, to);
	}

	private void addAirplane() {
		System.out.print("Give the airplane id: ");
		String id = scanner.nextLine();
		System.out.print("Give the airplane capacity: ");
		controlCenter.addPlane(id, Integer.parseInt(scanner.nextLine()));
	}
}
