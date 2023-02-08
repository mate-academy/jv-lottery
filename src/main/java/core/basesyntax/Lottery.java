package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER_RANDOM = 100;
    private Random randomNumberBall = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomNumberBall.nextInt(MAX_BALL_NUMBER_RANDOM), randomColor.getRandomColor());
    }
}
