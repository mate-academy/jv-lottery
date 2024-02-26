package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setNumber(new Random().nextInt(FIGURE_COUNT));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
