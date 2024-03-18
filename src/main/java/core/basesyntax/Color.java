package core.basesyntax;

public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    BLACK,
    WHITE;

    public String
                getColorName() {
        return
                name().toLowerCase();
    }
}
