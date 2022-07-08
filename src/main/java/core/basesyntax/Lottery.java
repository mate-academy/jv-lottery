package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }

    public int getRandomNumber() {
        return random.nextInt(BOUND);
    }
}
