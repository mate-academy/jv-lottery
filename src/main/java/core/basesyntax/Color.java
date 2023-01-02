package core.basesyntax;

public enum Color {
    WHITE(255, 255, 255),
    VERY_LIGHT_RED(255, 102, 102),
    LIGHT_RED(255, 51, 51),
    RED(255, 0, 0),
    DARK_RED(204, 0, 0),
    VERY_DARK_RED(153, 0, 0),
    VERY_LIGHT_BLUE(51, 204, 255),
    LIGHT_BLUE(51, 153, 255),
    BLUE(0, 0, 255),
    DARK_BLUE(0, 0, 204),
    VERY_DARK_BLUE(0, 0, 153),
    VERY_LIGHT_GREEN(102, 255, 102),
    LIGHT_GREEN(0, 255, 51),
    GREEN(0, 204, 0),
    DARK_GREEN(0, 153, 0),
    VERY_DARK_GREEN(0, 102, 0),
    BLACK(0, 0, 0);

    public final int red;
    public final int green;
    public final int blue;

    private Color(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }
}
