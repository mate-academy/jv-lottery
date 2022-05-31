package core.basesyntax;

import java.util.Random;

public class Ball {
    private final String color;
    private final int number;

    public Ball() {
        ColorSupplier color = new ColorSupplier();
        this.color = color.getRandomColor();

        this.number = new Random().nextInt(99) + 1;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
