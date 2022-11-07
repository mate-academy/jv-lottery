package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colSup = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColour(colSup.getRandomColor().toString());
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return ball;
    }
}
