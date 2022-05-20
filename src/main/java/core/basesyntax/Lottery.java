package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();
    private static final int NUMBERS_LIMIT = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColors(randomColor.getRandomColor());
        ball.setNumbers(random.nextInt(NUMBERS_LIMIT));
        return ball;
    }
}
