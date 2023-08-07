package core.basesyntax;

public enum Colors {
    BLUE("blue"),
    YELLOW("yellow"),
    GREEN("green"),
    RED("red");

    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
