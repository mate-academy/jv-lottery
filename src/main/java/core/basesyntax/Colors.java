package core.basesyntax;

public enum Colors {
    YELLOW("yellow"),
    RED("red"),
    PINK("pink"),
    GREEN("green"),
    BLUE("blue"),
    ORANGE("orange");

    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
