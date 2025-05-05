package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_NUMBER = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(RANGE_NUMBER);
        return new Ball(colorSupplier.getRandomColor(),ballNumber);
    }
}
