package wordle;

import java.util.ArrayList;
import java.util.List;

public final class UsedCharacters {
    private final List<Character> chars = new ArrayList<>();

    public void add(char c) {
        chars.add(c);
    }

    public List<Character> getUsed() {
        return chars;
    }
}
