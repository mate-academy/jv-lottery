package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_FIGURE_RANGE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int getRandomBallNamber() {
        return random.nextInt(MAX_FIGURE_RANGE) + 1;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(getRandomBallNamber());
        return ball;
    }
}
