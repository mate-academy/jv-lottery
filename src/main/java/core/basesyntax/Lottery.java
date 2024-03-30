package core.basesyntax;

import core.basesyntax.entity.Ball;
import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_OF_BALLS));
    }
}
