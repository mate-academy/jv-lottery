package core.basesyntax;

import java.util.Random;

public class Ball {
    private final Color color;
    private final Random number;

    public Ball(Color color, Random number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number
                + '}';
    }
}
