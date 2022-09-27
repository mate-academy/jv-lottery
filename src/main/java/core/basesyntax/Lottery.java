package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(RANDOM_NUMBER);
        return new Ball(cs.getRandomColor(),ballNumber);
    }
}
