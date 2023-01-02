package core.basesyntax;

public enum Color {
    BLACK("\033[1;90m"), // BLACK
    RED("\033[1;91m"),   // RED
    GREEN("\033[1;92m"), // GREEN
    YELLOW("\033[1;93m"),// YELLOW
    BLUE("\033[1;94m"),  // BLUE
    PURPLE("\033[1;95m"),// PURPLE
    CYAN("\033[1;96m"), // CYAN
    WHITE("\033[1;97m"); // WHITE

    public final String value;

    private Color(String color) {
        this.value = color;
    }
}