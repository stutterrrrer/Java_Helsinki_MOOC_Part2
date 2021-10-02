
public class SimpleDate {

	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(SimpleDate other) {
		if (this.year < other.year) {
			return true;
		}

		if (this.year == other.year
				&& this.month < other.month) {
			return true;
		}

		if (this.year == other.year
				&& this.month == other.month
				&& this.day < other.day) {
			return true;
		}

		return false;
	}

	public int differenceInYears(SimpleDate other) {
		if (earlier(other)) {
			return other.differenceInYears(this);
		}

		int yearRemoved = 0;

		if (this.month < other.month) {
			yearRemoved = 1;
		} else if (this.month == other.month && this.day < other.day) {
			yearRemoved = 1;
		}

		return this.year - other.year - yearRemoved;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SimpleDate that = (SimpleDate) o;

		if (day != that.day) return false;
		if (month != that.month) return false;
		return year == that.year;
	}

	@Override
	public int hashCode() {
		int result = day;
		result = 31 * result + month;
		result = 31 * result + year;
		return result;
	}
}
