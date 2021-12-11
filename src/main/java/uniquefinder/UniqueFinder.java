package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> getUniqueChars(String word) {
        List<Character> result = new ArrayList<>();
        if (word == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        for (char letter : word.toCharArray()) {
            if (!result.contains(letter)) {
                result.add(letter);
            }
        }
        return result;
    }
}
