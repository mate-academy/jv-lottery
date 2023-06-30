package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_MAX_VALUE = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomBallNumber = random.nextInt(BALL_NUMBER_MAX_VALUE);
        return new Ball(randomColor,randomBallNumber);
    }

}
