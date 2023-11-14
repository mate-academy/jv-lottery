package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}

