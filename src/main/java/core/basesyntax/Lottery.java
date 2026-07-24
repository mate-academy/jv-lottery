package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private Random rand = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int random = rand.nextInt(MAX_BALL_NUMBER);

        Ball ball = new Ball();
        ball.setNumber(random);

        String supply = colorSupplier.getRandomColor();
        ball.setColor(supply);

        return ball;
    }
}
