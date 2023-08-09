package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALL_COUNT = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = new Random().nextInt(NUMBER_OF_BALL_COUNT);
        Color ballColor = colorSupplier.getRandomColor();
        return new Ball(ballNumber, ballColor);
    }
}
