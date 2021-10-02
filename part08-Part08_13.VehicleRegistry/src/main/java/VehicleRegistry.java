import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
	private HashMap<LicensePlate, String> registry;

	public VehicleRegistry() {
		registry = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner) {
		if (registry.containsKey(licensePlate)) {
			return false;
		}
		registry.put(licensePlate, owner);
		return true;
	}

	public String get(LicensePlate licensePlate) {
		return registry.get(licensePlate);
	}

	public boolean remove(LicensePlate licensePlate) {
		return (!(registry.remove(licensePlate) == null));
	}

	public void printLicensePlates() {
		for (LicensePlate licensePlate : registry.keySet()) {
			System.out.println(licensePlate);
		}
	}

	public void printOwners() {
		ArrayList<String> printed = new ArrayList<>();
		for (String owner : registry.values()) {
			if (!printed.contains(owner)) {
				System.out.println(owner);
				printed.add(owner);
			}
		}
	}
}
