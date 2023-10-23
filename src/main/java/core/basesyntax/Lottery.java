package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(),random.nextInt(RANDOM_LIMIT));
    }
}
