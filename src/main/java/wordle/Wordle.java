package wordle;

import java.util.List;
import java.util.Map;

public interface Wordle {
    void setRandomWord();
    Map<Colour, List<Character>> processWord(List<Character> word);
}
