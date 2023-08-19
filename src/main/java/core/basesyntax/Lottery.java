package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(NUMBER_BOUND), colorSupplier.getRandomColor());
    }
}
