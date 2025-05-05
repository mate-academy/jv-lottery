package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_BOUND = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(RANGE_BOUND);
        return new Ball(randomColor, randomNumber);
    }
}
