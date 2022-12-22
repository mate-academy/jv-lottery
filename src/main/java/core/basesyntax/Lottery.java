package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int NUMBER_LIMIT = 101;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(NUMBER_LIMIT));
    }
}
