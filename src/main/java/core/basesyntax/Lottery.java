package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSSIBLE_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomInteger = random.nextInt(MAX_POSSIBLE_NUMBER + 1);
        return new Ball(randomInteger, colorSupplier.getRandomColor());
    }
}
