package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BOUND = 100;
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(NUMBER_OF_BOUND), colorSupplier.getRandomColor());
    }
}
