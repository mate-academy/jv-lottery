package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(LIMIT));
    }
}
