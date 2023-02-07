package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_LIMIT = 100;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(RANDOM_LIMIT));
    }
}
