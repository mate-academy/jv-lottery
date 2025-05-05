package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALLS_VALUE = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALLS_VALUE);
        return new Ball(color, number);
    }
}
