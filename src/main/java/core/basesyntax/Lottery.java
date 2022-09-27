package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSSIBLE_NUMBER = 100;

    public Ball getRandomBall() {
        Random randomGenerator = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(randomGenerator.nextInt(MAX_POSSIBLE_NUMBER),
                colorSupplier.getRandomColor());
    }
}
