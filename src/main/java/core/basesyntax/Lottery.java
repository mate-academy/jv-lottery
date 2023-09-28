package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = new Random().nextInt(MAX_BALL_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
