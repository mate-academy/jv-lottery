package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_BOUND = 100;

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(UPPER_BOUND),
                new ColorSupplier().getRandomColor().name());
    }
}
