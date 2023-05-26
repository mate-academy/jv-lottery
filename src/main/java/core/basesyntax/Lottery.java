package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_LIMIT = 100;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColors(randomColor.getRandomColor());
        ball.setNumbers(random.nextInt(NUMBERS_LIMIT));
        return ball;
    }
}
