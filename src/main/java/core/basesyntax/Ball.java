package core.basesyntax;

public class Ball {
    private final int number;
    private final Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball(number = " + number + ", " + "color = " + color + ")";
    }
}
