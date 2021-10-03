import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
	private HashMap<String, ArrayList<String>> storage;

	public StorageFacility() {
		storage = new HashMap<>();
	}

	public void add(String unit, String item) {
		storage.putIfAbsent(unit, new ArrayList<>());
		storage.get(unit).add(item);
	}

	public ArrayList<String> contents(String storageUnit) {
		return storage.getOrDefault(storageUnit, new ArrayList<>());
	}

	public void remove(String storageUnit, String item) {
		// size would be 0 if the key storageUnit doesn't exist.
		int size = storage.getOrDefault(storageUnit, new ArrayList<>()).size();
		if (size == 1) {
			storage.remove(storageUnit);
		} else if (size > 1) {
			storage.get(storageUnit).remove(item);
		} // don't need to anything if size == 0; i.e. key doesn't exist.
	}

	public ArrayList<String> storageUnits() {
		ArrayList<String> list = new ArrayList<>();
		for (String unit : storage.keySet()) {
			if (storage.get(unit).size() > 0) {
				list.add(unit);
			}
		}
		return list;
	}
}
