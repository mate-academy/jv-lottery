package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
    }
}
