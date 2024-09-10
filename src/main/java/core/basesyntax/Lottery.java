package core.basesyntax;

import java.util.Random;
import model.Ball;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }
}
