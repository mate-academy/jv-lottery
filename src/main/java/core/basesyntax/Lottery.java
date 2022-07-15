package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int WITHIN_NUMBER = 100;
    private final ColorSupplier randomColor = new ColorSupplier();

    private final Random randomBall = new Random();

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), randomBall.nextInt(WITHIN_NUMBER));
    }
}
