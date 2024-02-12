package core.basesyntax;

import core.basesyntax.model.Ball;
import java.util.Random;

public class Lottery {
    private static final int NUMBER = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(NUMBER), colorSupplier.getRandomColor());
    }
}
