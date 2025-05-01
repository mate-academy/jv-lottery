package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomball() {
        return new Ball(randomColor.getRandomColor(), random.nextInt(NUMBERS_COUNT));
    }
}
