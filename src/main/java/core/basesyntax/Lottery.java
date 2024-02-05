package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM_NUMBER = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), RANDOM_NUMBER.nextInt(101));
    }
}
