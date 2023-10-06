package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALLS_QUANTITY_BOUND = 100;
    private final Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setNumber(new Random().nextInt(BALLS_QUANTITY_BOUND));
        ball.setColor(new ColorSupplier().getRandomColor());
        return ball;
    }
}
