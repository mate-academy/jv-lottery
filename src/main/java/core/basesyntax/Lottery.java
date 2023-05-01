package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALL = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ball.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER_OF_BALL));
        return ball;
    }
}
