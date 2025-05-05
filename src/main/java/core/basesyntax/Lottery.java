package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_FOR_RANDOM_RANGE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER_FOR_RANDOM_RANGE);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
