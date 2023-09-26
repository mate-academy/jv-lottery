package core.basesyntax;

public enum Colors {
    Black("Black"),
    White("White"),
    Red("Red"),
    Yellow("Yellow"),
    Orange("Orange"),
    Pink("Pink"),
    Green("Green"),
    Blue("Blue");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
