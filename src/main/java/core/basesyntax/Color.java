package core.basesyntax;

public enum Color {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    ORANGE("Orange"),
    PINK("Pink"),
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
