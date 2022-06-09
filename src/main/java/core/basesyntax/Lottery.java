package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int range = 100;
        ball.setNumber(random.nextInt(range));
        ball.setColor(ball.getRandomColor());
        return ball;
    }
}
