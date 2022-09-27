package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
    }
}
