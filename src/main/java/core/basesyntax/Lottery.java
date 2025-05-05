package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int DEFAULT_NUMBER = 100;
    private Random newBall = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int indexBall = newBall.nextInt(DEFAULT_NUMBER);
        Ball ball = new Ball(colorSupplier.getRandomColor(), indexBall);
        return ball;

    }
}
