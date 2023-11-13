package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumber = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),randomNumber.nextInt(MAX_RANDOM_NUMBER));
    }
}
