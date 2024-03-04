package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color.name();
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getColor() + " " + getNumber();
    }
}
