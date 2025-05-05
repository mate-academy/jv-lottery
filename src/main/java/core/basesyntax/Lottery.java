package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSSIBLE_INT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomInt = random.nextInt(MAX_POSSIBLE_INT);
        return new Ball(randomColor, randomInt);

    }
}
