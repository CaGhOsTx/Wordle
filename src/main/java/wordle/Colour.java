package wordle;

public enum Colour {
    GREEN("Letter is in the word and in the right place."),
    YELLOW("Letter is in the word but at the wrong place."),
    GRAY("Letter is not in the word.");

    final String INFO;

    Colour(String info) {
        this.INFO = info;
    }


}
