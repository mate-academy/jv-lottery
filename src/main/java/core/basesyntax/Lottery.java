package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAX_NUMBER = 101;
    private static final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
