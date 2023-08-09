package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private static final int NUMBER_OF_BALL_COUNT = 100;

    public Ball getRandomBall() {
        int ballNumber = new Random().nextInt(NUMBER_OF_BALL_COUNT);
        Color ballColor = colorSupplier.getRandomColor();
        return new Ball(ballNumber, ballColor);
    }
}
