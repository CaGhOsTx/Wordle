module carlos.wordleproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens wordle to javafx.fxml;
    exports wordle;
}