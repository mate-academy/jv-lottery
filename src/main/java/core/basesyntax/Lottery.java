package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color ballColor = Color.valueOf(colorSupplier.getRandomColor());
        int ballNumber = random.nextInt(BALL_NUMBER_BOUND);
        return new Ball(ballColor, ballNumber);
    }
}
