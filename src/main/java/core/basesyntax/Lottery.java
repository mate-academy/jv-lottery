package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_OF_BOUND = 101;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(MAX_OF_BOUND));
        return ball;
    }
}
