package core.basesyntax;

import core.basesyntax.models.Ball;
import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER_BOUND = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(RANDOM_NUMBER_BOUND),
                this.colorSupplier.getRandomColor());
    }
}
