package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(100) + 1; // Random number between 1 and 100
        return new Ball(color, number);
    }
}
