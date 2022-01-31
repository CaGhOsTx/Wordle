package wordle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dictionary {

    private final List<String> words;

    public Dictionary () throws IOException {
        words = loadWords();
    }

    private List<String> loadWords() throws IOException {
        try (var reader = Files.lines(Path.of("words.txt"))) {
            return reader.filter(w -> w.length() == 5).distinct().toList();
        }
    }

    public List<Character> getRandomWord() {
        var word = words.get(ThreadLocalRandom.current().nextInt(words.size()));
        var chars = new ArrayList<Character>();
        for(var c : word.toCharArray()) chars.add(c);
        return chars;
    }
}
