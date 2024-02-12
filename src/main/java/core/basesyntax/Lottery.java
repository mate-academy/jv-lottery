package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random randomBall = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        int randomNumber = randomBall.nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
