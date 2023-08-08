package core.basesyntax;

public enum Color {
    BLUE("blue"),
    YELLOW("yellow"),
    GREEN("green"),
    RED("red");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
