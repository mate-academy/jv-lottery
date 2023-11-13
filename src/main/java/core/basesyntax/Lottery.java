package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumber = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),randomNumber.nextInt(MAX_RANDOM_NUMBER));
    }
}
