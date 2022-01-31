package wordle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static wordle.Colour.*;

public class Model implements Wordle {

    Dictionary d = new Dictionary();

    List<Character> wordToGuess;

    public Model() throws IOException {}


    @Override
    public void setRandomWord() {
        wordToGuess = d.getRandomWord();
    }

    @Override
    public Map<Colour, List<Character>> processWord(List<Character> word) {
        var map = new HashMap<Colour, List<Character>>();
        for (int i = 0; i < word.size(); i++) {
            Character c = word.get(i);
            if (wordToGuess.contains(c))
                mapColourToCharacter(map, c, lettersAreEqual(i, c) ? GREEN : YELLOW);
            else mapColourToCharacter(map, c, GRAY);
        }
        return map;
    }

    private boolean lettersAreEqual(int i, Character c) {
        return wordToGuess.get(i) == c;
    }

    private void mapColourToCharacter(HashMap<Colour, List<Character>> map, Character c, Colour yellow) {
        map.computeIfAbsent(yellow, k -> new ArrayList<>()).add(c);
    }
}
