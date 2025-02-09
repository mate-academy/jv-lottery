package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();

    public Ball getRandomBall(Ball ball) {
        ball.setNumber(random.nextInt(MAX_NUMBER + 1));
        return ball;
    }
}
