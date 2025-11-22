package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_RANGE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(NUMBER_RANGE);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
