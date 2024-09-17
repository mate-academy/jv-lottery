package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Ball ball = new Ball();
    private Random random = new Random();

    public Ball getRandomBall() {
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(random.nextInt(BOUND));
        return ball;
    }
}
