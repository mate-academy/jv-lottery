package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_COUNT = 100;
    private Random random = new Random();
    private Ball randomBall = new Ball();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomball() {
        randomBall.setBall(randomColor.getRandomColor(), random.nextInt(NUMBERS_COUNT));
        return randomBall;
    }
}
