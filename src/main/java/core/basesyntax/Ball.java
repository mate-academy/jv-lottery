package core.basesyntax;

import java.util.Objects;

public class Ball {
    private final int number;
    private final Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = Objects.requireNonNull(color);
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
