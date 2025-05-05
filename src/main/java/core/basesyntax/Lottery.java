package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER_OF_BALL = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_RANDOM_NUMBER_OF_BALL) + 1;
        return new Ball(colorSupplier.getRandomColor().name(), number);
    }
}
