package core.basesyntax;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    YELLOW("yellow"),
    BLACK("black"),
    WHITE("white");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
