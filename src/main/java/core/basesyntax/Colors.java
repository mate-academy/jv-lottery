package core.basesyntax;

public enum Colors {
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
