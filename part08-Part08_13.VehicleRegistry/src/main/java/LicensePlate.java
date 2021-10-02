
import java.util.Objects;

public class LicensePlate {
	// don't modify existing parts of this class

	// these instance variables have been defined as final, meaning
	// that once set, their value can't be changed
	private final String liNumber;
	private final String country;

	public LicensePlate(String country, String liNumber) {
		this.liNumber = liNumber;
		this.country = country;
	}

	@Override
	public String toString() {
		return country + " " + liNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		LicensePlate that = (LicensePlate) o;

		if (!liNumber.equals(that.liNumber)) return false;
		return country.equals(that.country);
	}

	@Override
	public int hashCode() {
		int result = liNumber.hashCode();
		result = 31 * result + country.hashCode();
		return result;
	}
}
