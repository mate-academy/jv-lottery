package core.basesyntax;

import java.util.Random;
import model.Ball;
import model.ColorSupplier;

public class Lottery {
    private static final int MAX_NUMBER_RANGE = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER_RANGE + 1)
        );
    }
}
