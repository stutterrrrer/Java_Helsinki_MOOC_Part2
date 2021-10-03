import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
	private HashMap<String, ArrayList<String>> dictionary;

	public DictionaryOfManyTranslations() {
		dictionary = new HashMap<>();
	}

	public void add(String word, String translation) {
		// if this word wasn't added before and not yet associated with a list:
		dictionary.putIfAbsent(word, new ArrayList<>());
		dictionary.get(word).add(translation);
	}

	public ArrayList<String> translate(String word) {
		return dictionary.getOrDefault(word, new ArrayList<>());
	}

	public void remove(String word) {
		dictionary.remove(word);
	}
}
