


public class Main {

	public static void main(String[] args) {
		// the following is the same sample program shown in ex 8.13 description

		LicensePlate c1 = new LicensePlate("Ire", "1234");
		LicensePlate c2 = new LicensePlate("Ire", "2042");
		LicensePlate c3 = new LicensePlate("UK", "402");
		LicensePlate c4 = new LicensePlate("US", "50234");

		VehicleRegistry registry = new VehicleRegistry();
		registry.add(c1, "ian");
		registry.add(c2, "ian");
		registry.add(c3, "Cathy");
		registry.add(c4, "Alexandria O. Cortez");

		System.out.println(registry.get(c3));
		registry.printLicensePlates();
		registry.printOwners();
		registry.remove(c3);
		registry.printOwners();
	}
}
