package core.basesyntax;

import java.util.Random;

public class Ball {
    private final String color;
    private final int number;

    public Ball() {
        this.color = ColorSupplier.getRandomColor();
        this.number = new Random().nextInt(101);
    }

    @Override
    public String toString() {
        return "color: " + this.color + " | " + "number: " + this.number;
    }
}
