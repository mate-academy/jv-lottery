package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_BALL = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int indexBall = new Random().nextInt(MAX_NUMBER_BALL);
        return new Ball(colorSupplier.getRandomColor(), indexBall);
    }
}
