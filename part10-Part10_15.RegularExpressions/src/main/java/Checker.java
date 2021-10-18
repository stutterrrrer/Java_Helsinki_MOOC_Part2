public class Checker {
	// these methods all could've been static

	public boolean isDayOfWeek(String string) {
		String regex = "mon|t(ue|hu)|wed|fri|s(at|un)";
		return string.matches(regex);
	}

	public boolean allVowels(String string) {
		String regex = "[aeiou]+";
		return string.matches(regex);
	}

	public boolean timeOfDay(String string) {
		String regex = "([01][0-9]|2[0-3])(:[0-5][0-9]){2}";
		return string.matches(regex);
	}
}
