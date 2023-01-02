package core.basesyntax;

public enum Color {
    BLACK("\033[1;90m"),
    RED("\033[1;91m"),
    GREEN("\033[1;92m"),
    YELLOW("\033[1;93m"),// YELLOW
    BLUE("\033[1;94m"),
    PURPLE("\033[1;95m"),// PURPLE
    CYAN("\033[1;96m"),
    WHITE("\033[1;97m");

    private final String value;

    private Color(String color) {
        this.value = color;
    }

    public String getValue() {
        return value;
    }
}
