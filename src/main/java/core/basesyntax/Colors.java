package core.basesyntax;

public enum Colors {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    ORANGE("Orange"),
    RED("Red"),
    WHITE("White");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
