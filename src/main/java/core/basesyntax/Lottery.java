package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAX_BOUND = 100;

    public Lottery(Random random) {
        super(random);
    }

    public Ball getRandomBall() {
        return new Ball(getRandomColor(), getRandom().nextInt(MAX_BOUND));
    }
}
