package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random numberRandomizer = new Random();

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        int ballNumber = numberRandomizer.nextInt(BALL_MAX_NUMBER + 1);
        return new Ball(ballColor, ballNumber);
    }
}
