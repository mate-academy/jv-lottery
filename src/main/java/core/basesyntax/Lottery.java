package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_SUPPLIER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ColorSupplier cs = new ColorSupplier();
        ball.setNumber(random.nextInt(BALL_SUPPLIER));
        ball.setColor(cs.getRandomColor());
        return ball;
    }
}


