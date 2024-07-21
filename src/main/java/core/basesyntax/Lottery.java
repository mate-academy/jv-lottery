package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 101;
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor();
        ball.setNumber(new Random().nextInt(BOUND));
        return ball;
    }
}
