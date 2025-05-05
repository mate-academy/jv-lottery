package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), ballNumber);
    }
}
