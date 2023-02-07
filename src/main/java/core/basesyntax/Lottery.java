package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int NUMBER_LIMIT = 100;
    private final Random rnd = new Random();
    private final ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(cs.getRandomColor(), rnd.nextInt(NUMBER_LIMIT));
    }
}
