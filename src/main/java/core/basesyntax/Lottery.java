package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(MAXIMUM_POSSIBLE_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
