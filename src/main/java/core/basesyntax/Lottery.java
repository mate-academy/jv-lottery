package core.basesyntax;

import java.util.Random;

public class Lottery<BOUND> {
    private static final int MY_BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random randomBall = new Random();
        return new Ball(colorSupplier.getRandomColor(), randomBall.nextInt(MY_BOUND));
    }
}
