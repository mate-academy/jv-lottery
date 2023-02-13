package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAGIC_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAGIC_NUMBER);
        return new Ball(randomNumber, colorSupplier.getRandomColor());
    }
}
