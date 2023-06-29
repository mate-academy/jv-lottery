package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_MAX_VALUE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int randomBallNumber = random.nextInt(BALL_NUMBER_MAX_VALUE);
        return new Ball(color,randomBallNumber);
    }

}
