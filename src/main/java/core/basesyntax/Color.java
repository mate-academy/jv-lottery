package core.basesyntax;

public enum Color {
    GREEN("green"), BLUE("blue"), YELLOW("yellow");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
