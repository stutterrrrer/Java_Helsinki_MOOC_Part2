package FlightControl.domain;

public class Flight {
	private Airplane plane;
	private Airport from;
	private Airport to;

	public Flight(Airplane plane, Airport from, Airport to) {
		this.plane = plane;
		this.from = from;
		this.to = to;
	}

	public String toString() {
		return plane.toString() + " (" + from.toString() + "-" + to.toString() + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Flight flight = (Flight) o;

		if (!plane.equals(flight.plane)) return false;
		if (!from.equals(flight.from)) return false;
		return to.equals(flight.to);
	}

	@Override
	public int hashCode() {
		int result = plane.getId().hashCode();
		result = 31 * result + from.getId().hashCode();
		result = 31 * result + to.getId().hashCode();
		return result;
	}
}
