package core.basesyntax;

public enum Color {
    RED,
    BLUE,
    GREEN,
    YELLOW,
    ORANGE,
    PURPLE,
    PINK;

    private static Color[] colors = Color.values();
    public static Color getByIndex(int index) {
        return colors[index];
    }
}
