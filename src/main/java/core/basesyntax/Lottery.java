package core.basesyntax;

import java.util.Random;

public abstract class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(randomNumber, randomColor.getRandomColor());
    }
}
