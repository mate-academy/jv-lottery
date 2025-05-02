package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_MAX_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(RANDOM_MAX_VALUE);
        return new Ball(randomColor, randomNumber);
    }
}
