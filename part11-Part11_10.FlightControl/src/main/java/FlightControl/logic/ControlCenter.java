package FlightControl.logic;
import FlightControl.domain.*;

import java.util.HashMap;
import java.util.Map;

public class ControlCenter {
	private Map<String, Airplane> planeMap;
	private Map<Flight, Flight> flightMap;
	private Map<String, Airport> airportMap;

	public ControlCenter() {
		planeMap = new HashMap<>();
		flightMap = new HashMap<>();
		airportMap = new HashMap<>();
	}

	// implement the add methods by calling constructors;
	// otherwise the heavy work would go to the text ui which would need to construct them.
	public void addPlane(String id, int capacity) {
		planeMap.putIfAbsent(id, new Airplane(id, capacity));
	}

	public void addFlight(String planeId, String fromId, String toId) {
		airportMap.putIfAbsent(fromId, new Airport(fromId));
		airportMap.putIfAbsent(toId, new Airport(toId));
		Flight flight = new Flight(planeMap.get(planeId), airportMap.get(fromId), airportMap.get(toId));
		flightMap.putIfAbsent(flight, flight);
	}

	public void printAirplanes() {
		planeMap.values().forEach(System.out::println);
	}

	public void printFlights() {
		flightMap.values().forEach(System.out::println);
	}

	public void printAirplaneDetails(String id) {
		System.out.println(planeMap.get(id));
	}
}
