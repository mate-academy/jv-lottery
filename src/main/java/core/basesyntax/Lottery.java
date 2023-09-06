package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(LIMIT_NUMBER);
        return new Ball(number, colorSupplier.getRandomColor().name());
    }
}
