package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER));
        return ball;
    }
}
