package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;

    public Lottery() {
        random = new Random();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(100));
        ball.setColor(ColorSupplier.getRandomColor());
        return ball;
    }
}
