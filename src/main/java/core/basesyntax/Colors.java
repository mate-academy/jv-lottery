package core.basesyntax;

public enum Colors {

    GREEN("green"), BLUE("blue"), YELLOW("yellow");

    private final String colorName;

    Colors(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
