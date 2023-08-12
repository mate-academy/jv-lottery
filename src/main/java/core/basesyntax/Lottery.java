package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public int getRmInt() {
        return random.nextInt(FIGURE_COUNT) + 1;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(getRmInt());
        return ball;
    }
}
