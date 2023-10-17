package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int number = 3;
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(number));
        return ball;
    }
}
