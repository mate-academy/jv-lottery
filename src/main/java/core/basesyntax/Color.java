package core.basesyntax;

public enum Color {
    BLUE(0),
    RED(1),
    YELLOW(2),
    WHITE(3),
    PURPLE(4),
    GREEN(5);

    private int number;

    public int getNumber() {
        return number;
    }

    Color(int number) {
        this.number = number;
    }
}