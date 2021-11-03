package core.basesyntax;

public enum Colors {

    Green("Green"),
    White("White"),
    Yellow("Yellow"),
    Black("Black"),
    Red("Red"),
    Blue("Blue");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
