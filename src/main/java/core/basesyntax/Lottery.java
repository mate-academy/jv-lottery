package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    Random random = new Random();
    Ball ball = new Ball();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));

        return ball;
    }
}
