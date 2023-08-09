package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALL_COUNT = 100;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = RANDOM.nextInt(MAX_NUMBER_OF_BALL_COUNT);
        Color ballColor = colorSupplier.getRandomColor();
        return new Ball(ballNumber, ballColor);
    }
}
