package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER_EXCLUSIVE = 101;

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER_EXCLUSIVE);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
