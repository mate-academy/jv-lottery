package core.basesyntax;

import java.util.Random;

public class Ball {
    private final String color;
    private final int number;

    public Ball() {
        Random random = new Random();
        this.number = random.nextInt(101);
        this.color = new ColorSupplier().getRandomColor();
    }

    @Override
    public String toString() {
        return String.valueOf(number) + " " + color;
    }
}
