package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAXIMUM_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
