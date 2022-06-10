package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
