package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(BALL_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
