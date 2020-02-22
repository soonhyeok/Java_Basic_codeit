import java.util.HashMap;

public class WordDictionary {
    HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String key, String value) {
        dictionary.put(key.toUpperCase(), new String(value));
    }

    public String find(String key) {
        return dictionary.get(key.toUpperCase());
    }
}