package core.basesyntax;

public enum Colors {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    YELLOW("Yellow"),
    ORANGE("Orange"),
    PINK("Pink"),
    GREEN("Green"),
    BLUE("Blue");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
