public class LiteracyRecord implements Comparable<LiteracyRecord> {
	private final String gender;
	private final String country;
	private final int year;
	private final Double literacyRate;

	public LiteracyRecord(String wholeLine) {
		String[] splits = wholeLine.split(",");
		// apparently to escape parenthesis in String literal, need "\\(" instead of "\("
		gender = splits[2].split("\\(%\\)")[0].trim();
		country = splits[3];
		year = Integer.parseInt(splits[4]);
		literacyRate = Double.valueOf(splits[5]);
	}

	@Override
	public int compareTo(LiteracyRecord compared) {
		return literacyRate.compareTo(compared.literacyRate);
	}

	@Override
	public String toString() {
		return country + " (" + year + "), " + gender + ", " + literacyRate;
	}
}
