import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {
	private HashMap<String,String> abbreviations;

	public Abbreviations() {
		abbreviations = new HashMap<>();
	}

	public void addAbbreviation(String abbreviation, String explanation) {
		abbreviations.put(abbreviation, explanation);
	}

	public boolean hasAbbreviation(String abbreviation) {
		return abbreviations.containsKey(abbreviation);
	}

	public String findExplanationFor(String abbreviation) {
		if (!abbreviations.containsKey(abbreviation)) {
			return null;
		}
		return abbreviations.get(abbreviation);
	}
}
