package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND_OF_NUMBER = 100;
    Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), (random.nextInt(BOUND_OF_NUMBER) + 1));
    }
}
