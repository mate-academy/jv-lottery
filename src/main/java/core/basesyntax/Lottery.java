package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(NUMBER_BOUND);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
