package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private Random randomBallNumber = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomColor
                .getRandomColor().name(), randomBallNumber.nextInt(MAX_BALL_NUMBER));
    }
}
