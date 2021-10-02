public class Main {

	public static void main(String[] args) {
		// make test programs here

		SimpleDate date1 = new SimpleDate(1, 1, 2000);
		SimpleDate date2 = new SimpleDate(5, 2, 2000);
		SimpleDate date3 = new SimpleDate(5, 2, 2020);
		System.out.println(date1.hashCode() + "\n"
				+ date2.hashCode() + "\n"
				+ date3.hashCode());
	}
}
