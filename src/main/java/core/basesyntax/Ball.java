package core.basesyntax;

public class Ball {
    private final String color; // Changed to String
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\''
            + ", number=" + number + '}';
    }
}
