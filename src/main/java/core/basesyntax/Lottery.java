package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(BOUND + 1));
    }
}
