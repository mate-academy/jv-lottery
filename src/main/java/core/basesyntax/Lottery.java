package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER = new Random().nextInt(100);
    private ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(cs.getRandomColor(), RANDOM_NUMBER);
    }
}
