package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
	private Map<String, String> words;
	private String savedDictionaryName;

	public SaveableDictionary() {
		words = new HashMap<>();
	}

	public SaveableDictionary(String file) {
		words = new HashMap<>();
		savedDictionaryName = file;
	}

	public boolean load() {
		try {
			Files.lines(Paths.get(savedDictionaryName))
					.map(s -> s.split(":"))
					// add each line in the dictionary to the HashMap.
					.forEach(splits -> words.putIfAbsent(splits[0], splits[1]));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void add(String word, String translation) {
		if (!words.containsKey(word) && !words.containsKey(translation)) {
			words.put(word, translation);
		}
	}

	public String translate(String word) {
		if (words.containsKey(word)) {
			return words.get(word);
		} else {
			for (String key : words.keySet()) {
				if (words.get(key).equals(word)) {
					return key;
				}
			}
			return null;
		}
	}

	public void delete(String word) {
		// remove the pair if word matches a key
		if (words.containsKey(word)) {
			words.remove(word);
		} else {
			// remove the pair if word matches a value
			String keyToRemove = "";
			for (String key : words.keySet()) {
				if (words.get(key).equals(word)) {
					keyToRemove = key;
					break;
				}
			}
			words.remove(keyToRemove);
		}
	}

	public boolean save() {
		try {
			PrintWriter pw = new PrintWriter(savedDictionaryName);
			for (String key : words.keySet()) {
				pw.println(key + ":" + words.get(key));
			}
			pw.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
}
