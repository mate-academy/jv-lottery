package core.basesyntax;

import java.util.Random;

public class Lottery<BOUND> {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        Random randomBall = new Random();
        return new Ball(colorSupplier.getRandomColor(), randomBall.nextInt(BOUND));
    }
}
