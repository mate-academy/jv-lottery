package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        final int magicNumber = random.nextInt(BOUND);
        return new Ball(new ColorSupplier().getRandomColor(), magicNumber);
    }
}
